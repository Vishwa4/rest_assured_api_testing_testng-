package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class AppTest 
{

    @Test
    void test_01()
    {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader(response.contentType()));
        System.out.println(response.getTime());

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
    @Test
    void test_02(){

    }
    @Test
    void test_03(){
        RestAssured.given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
                .all();
    }


}
