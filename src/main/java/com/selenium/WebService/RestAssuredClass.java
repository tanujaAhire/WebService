package com.selenium.WebService;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredClass
{

	@Test(enabled=false)
	public void rest()
	{
		RestAssured.baseURI="https://reqres.in";
		RestAssured.given().contentType("application/json").
		body("{\r\n    \"email\": \"peter@klaven\",\r\n    \"password\": \"cityslicka\"\r\n}").
		when().post("/api/login").
		then().statusCode(200);
	}
	
	@Test
	public void soap()
	{

		RestAssured.baseURI="http://www.webservicex.com/globalweather.asmx";
		RestAssured.given().contentType("text/xml").
		body("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <web:GetCitiesByCountry>\r\n         <!--Optional:-->\r\n         <web:CountryName>india</web:CountryName>\r\n      </web:GetCitiesByCountry>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>").
		when().post("").
		then().statusCode(200);
	}
}
