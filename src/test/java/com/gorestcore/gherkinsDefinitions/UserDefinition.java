package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.CommonSteps;
import com.gorestcore.serenitySteps.CreateUserStep;
import com.gorestcore.serenitySteps.UpdateUserNameStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class UserDefinition {


    @When("^new user is created with name \"([^\"]*)\", gender \"([^\"]*)\", email \"([^\"]*)\", status \"([^\"]*)\"$")
    public void newUserIsCreatedWithNameGenderEmailStatus(String name,String gender,String email,String status) throws Throwable {
        CreateUserStep.sendRequestWithJsonBody(name,gender,email,status);
    }

}
