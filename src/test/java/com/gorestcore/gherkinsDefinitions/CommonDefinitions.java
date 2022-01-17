package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.CommonSteps;
import cucumber.api.java.en.When;

import java.io.IOException;

public class CommonDefinitions {

    @When("^the user is authorised$")
    public void authorise() throws IOException {
        CommonSteps.setAuthToken();
    }
}
