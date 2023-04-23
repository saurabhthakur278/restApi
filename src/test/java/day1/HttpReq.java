package day1;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class HttpReq {

	public static void main(String srgs[]) {
		
 RestAssured.baseURI="https://rahulshettyacademy.com";
 
 
 RestAssured.useRelaxedHTTPSValidation();
 
 
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "")
		.when().post("/maps/api/place/add/json")
		
		.then().log().all().assertThat().statusCode(200);

		
	}
}
//given(
//content type, cookies , header,add auth, add parameter etc....
//when()
//get(), port, put ,delete
//then()
//validate status code, extract response,Extract header, cookies etc....




//
//.when()
// .get("https://restful-booker.herokuapp.com/booking")
//
//.then()
//  .statusCode(200)
//  .log().all();