package com.selenium.framework.restassured.spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

/**
 * Purpose : Program to test the spotify api
 * 
 * @author Sahil Kudake
 *
 */
@Test
public class SpotifyRest {

	String token;
	String userId;

	@BeforeMethod
	public void setup() {
		token = "Bearer BQB075M9UT7OcdYRxlzwCdzOSYg8k6hrYYReoFDGeBmz786igdNh7Kuabq5lwHJUFAzRm40WJOGaMgYvhPaBtvwQGnzyZWPIIUPKNnaU8qU6vm4NkUsyTV7R0_9VhpPrAxGWCT4iWP3XKXkYL3mFucVrgSnAT5Fnw9EqkiNjKGht1fCWz6NCeATgs9R-II4HimUixZJcrJEwaY0zSEX9PCcMtJTq-MGTbbnKdT--xstkdn-WtSn3TOvv8XiYpzme2NvRr4MXfsnmS6aXdG-slcGYxCPBkriN9Q";
	}

	@Test(priority = 1)
	public void spotifyUserProfile() {
		Response response = given().header("Accept", "application/json").header("Content-Type", "application/json")
				.header("Authorization", token).when().get("https://api.spotify.com/v1/me");

		@SuppressWarnings("rawtypes")
		ResponseBody body = response.getBody();

		JsonObject object = (JsonObject) new JsonParser().parse(body.prettyPrint());
		userId = String.valueOf(object.get("id"));
		System.out.println(userId);
		response.then().assertThat().statusCode(200);
	}

	@Test(priority = 2)
	public void specificUserId() {
		Response response = given().header("Accept", "application/json").header("Content-Type", "application/json")
				.header("Authorization", token).when()
				.get("https://api.spotify.com/v1/users/31lsdg2tza4alqs4vnkt3pdj2ynu");
		System.out.println("return user Id " + userId);
		@SuppressWarnings("rawtypes")
		ResponseBody body = response.getBody();
		JsonObject object;

		object = (JsonObject) new JsonParser().parse(body.prettyPrint());
		String type = String.valueOf(object.get("type"));
		System.out.println(type);
		response.then().assertThat().statusCode(200);
	}

	@Test(priority = 3)
	public void getToatalUserList() {
		Response responseUserList = RestAssured.given().accept("application/json").contentType("application/json")
				.header("Authorization", token).when()
				.get("https://api.spotify.com/v1/users/31lsdg2tza4alqs4vnkt3pdj2ynu/playlists");
		String asString = responseUserList.asString();
		JsonPath jsonPath = new JsonPath(asString);
		int total = jsonPath.getInt("total");
		System.out.println("total==>" + total);
		responseUserList.prettyPrint();
	}
}
