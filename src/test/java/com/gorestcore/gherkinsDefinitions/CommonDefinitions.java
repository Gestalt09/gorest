package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.CommonSteps;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.util.List;

public class CommonDefinitions {
    @When("^the user is authorised$")
    public void theUserIsAuthorised() throws IOException {
        CommonSteps.setAuthToken();
    }

    @Then("^the user gets status code \"([^\"]*)\"$")
    public void assertStatusCode(int statusCode) {
        CommonSteps.assertStatusCode(statusCode);
    }
}