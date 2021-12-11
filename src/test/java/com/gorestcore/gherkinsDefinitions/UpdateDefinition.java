package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.CommonSteps;
import com.gorestcore.serenitySteps.UpdateUserNameStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class UpdateDefinition {
    @When("^user name is updated to \"([^\"]*)\"$")
    public void userNameIsUpdatedTo(String name) throws Throwable {
        UpdateUserNameStep.updateUserName(name);
    }
}
