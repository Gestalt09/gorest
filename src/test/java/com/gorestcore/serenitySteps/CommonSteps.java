package com.gorestcore.serenitySteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.rest;
import static org.hamcrest.Matchers.equalTo;



public class CommonSteps {


    @Step
    public static void setAuthToken() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/resources/data.properties"));
        given()
                .header("Authorization", "Bearer " + prop.getProperty("token"))
                .then()
                .statusCode(200);


    }



    @Step
    public static void deleteUser() {


        given().header("authorization", "Bearer 2e490403c46a1f90d011f4a211a7f4e9c6228a7031ce06e851e6e3422269915e")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .delete("https://gorest.co.in/public-api/users/3760")   //hit the post end point
                .then().
                assertThat()
                .statusCode(HttpStatus.SC_OK);


    }
}
