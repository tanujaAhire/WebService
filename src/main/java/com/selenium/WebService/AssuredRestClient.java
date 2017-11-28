package com.selenium.WebService;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AssuredRestClient 
{

@Test(enabled=false)	


    public void rest()
    {
	    RestAssured.baseURI="https://reqres.in/api/users";
	    Response resp=RestAssured.given().
	                  contentType("application/json").
	                   body("{\r\n    \"name\": \"morpheus\",\r\n    \"job\": \"leader\"\r\n}").
	                   when().post("");
	   int responseCode=resp.getStatusCode();
	   System.out.println("This is the response code:" +responseCode);
	   
	   String response=resp.getBody().asString();
	   System.out.println("The response of the API"+response);
	   
	   long time=resp.getTime();
	   System.out.println(time);
	  
	  
    }
   @Test
     public void soap()
     {
       RestAssured.baseURI="http://www.webservicex.com/globalweather.asmx";
   	   Response resp=RestAssured.given().
   	                 contentType("text/xml").
   	                 body("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <web:GetCitiesByCountry>\r\n         <!--Optional:-->\r\n         <web:CountryName>india</web:CountryName>\r\n      </web:GetCitiesByCountry>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>").
   	                 when().post("");
   	  
   	   int responseCode=resp.getStatusCode();
	   System.out.println("This is the response code:" +responseCode);
	   
	   String response=resp.getBody().asString();
	   System.out.println("The response of the API"+response);
	   
	   long time=resp.getTime();
	   System.out.println(time);
	  
	
     }

	
}
