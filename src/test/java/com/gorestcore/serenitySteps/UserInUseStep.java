package com.gorestcore.serenitySteps;

import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static net.serenitybdd.rest.RestRequests.given;
import static org.hamcrest.Matchers.equalTo;

public class UserInUseStep {
    @Step
    public static void createUserWithExistingEmail(String email) throws IOException {
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
                .body("code", equalTo(422));




    }
}
