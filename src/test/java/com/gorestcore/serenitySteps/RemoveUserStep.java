package com.gorestcore.serenitySteps;

import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

import java.io.FileInputStream;
import java.util.Properties;

import static net.serenitybdd.rest.RestRequests.given;
import static org.hamcrest.Matchers.equalTo;

public class RemoveUserStep {
    @Step
    public static void RemoveExistedUser() throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/resources/data.properties"));


        given().header("authorization", "Bearer " + prop.getProperty("token"))
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .and()
                .delete("https://gorest.co.in/public-api/users/" + prop.getProperty("id"))
                .then().
                assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("code", equalTo(204));
    }

    @Step
    public static void RemoveAlreadyRemovedUser(String user) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/resources/data.properties"));


        given().header("authorization", "Bearer " + prop.getProperty("token"))
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .and()
                .delete("https://gorest.co.in/public-api/users/" + prop.getProperty("id"))
                .then().
                assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("code", equalTo(404));

    }
}
