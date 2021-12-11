package com.gorestcore.serenitySteps;

import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static net.serenitybdd.rest.RestRequests.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserNameStep {
    @Step
    public static void updateUserName(String name) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/resources/data.properties"));

        String jsonBody = "{" +
                "   \"name\":\"NikitaSS\",\n" +
                "   \"status\":\"active\"\n" +
                "}";

        given().header("authorization", "Bearer " + prop.getProperty("token"))
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .patch("https://gorest.co.in/public-api/users/" + prop.getProperty("id"))   //put id from fresh user in data.properties
                .then().
                assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("data.name", equalTo("NikitaSS"));




    }
}
