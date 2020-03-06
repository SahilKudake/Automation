package com.selenium.framework.restassured;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}


/*  
 
 public class SpotifyRestAssured {
    String token;
    String userId;
    String playlistName;
    String tracklist;


    @Before
    public void setUp() {
        token = "Bearer BQC91nHLVnagtm2Y5KA8sz2N6R-kl1HFjg6IhLjVYIp_zZ43rpr1VuIdqUN6L1Dhg2STh8elE0aMvAoAVXvVBvAZS9iOcBYTTTMrIXNwdxaTAjb_6y00RQ_yOV_IriU33eBsCbWkfxAFAsCg3w6fgfFhN9SObC2ms3JaYwcisjn5A9SsEg9vz7LwcgaP2zAagswmcCXm1cwT_Tq-i0-dDdvWyP-PSNrc2VyfYAl7YSU1Zxjk5Sye2wgpWySy734JKLZDiezJLjKcPJQqtnbdIUWBdeVw7pv-xA";
    }
    @Test
    public void spotify_RestAssured_AutomationTest() {
        Response respons = given()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .when()
                .get("https://api.spotify.com/v1/me");
        ResponseBody body = respons.getBody();
        JsonObject object = (JsonObject) new JsonParser().parse(body.prettyPrint());
        userId = String.valueOf(object.get("id"));
        System.out.println(userId);
        respons.then().assertThat().statusCode(200);
    }

    @Test
    public void whenGivenToken_ShouldReturnUserId() {
        Response responseForUser = given()
                .accept("application/json")
                .contentType("application/json")
                .header("Authorization", token)
                .when()
                .get("https://api.spotify.com/v1/users/"+userId);
        ResponseBody body = responseForUser.getBody();
        JsonObject object = (JsonObject) new JsonParser().parse(body.prettyPrint());
        String type = String.valueOf(object.get("type"));
        System.out.println(type);
        responseForUser.then().assertThat().statusCode(200);
    }

    @Test
    public void givenUserID_GetToatalUserList() {
        Response responseUserList = RestAssured.given()
                .accept("application/json")
                .contentType("application/json")
                .header("Authorization", token)
                .when()
                .get("https://api.spotify.com/v1/users/"+userId+"/playlists");
        String asString = responseUserList.asString();
        JsonPath jsonPath = new JsonPath(asString);
        int total = jsonPath.getInt("total");
        System.out.println("total==>" + total);
        responseUserList.prettyPrint();

    }
    //------------------------------
 
 */