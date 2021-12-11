package com.gorestcore.serenitySteps;

import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

import java.io.FileInputStream;
import java.util.Properties;

import static net.serenitybdd.rest.RestRequests.given;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserStep {
    @Step
    public static void sendRequestWithJsonBody(String name, String gender, String email, String status) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/resources/data.properties"));


        // Json Body to pass in the request
        String jsonBody = "{" +
                "   \"name\":\"NikitaS\",\n" +
                "   \"gender\":\"male\",\n" +
                "   \"email\":\"dragon22@gmail.com\",\n" +
                "   \"status\":\"active\"\n" +
                "}";

        given().header("authorization", "Bearer " + prop.getProperty("token"))
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .post("https://gorest.co.in/public-api/users")   //hit the post end point
                .then().
                assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("data.name", equalTo("NikitaS"))
                .body("data.gender", equalTo("male"))
                .body("data.email", equalTo("dragon22@gmail.com"))
                .body("data.status", equalTo("active"));
    }
}