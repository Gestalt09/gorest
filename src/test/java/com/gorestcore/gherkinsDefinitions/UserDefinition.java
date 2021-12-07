package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.CommonSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class UserDefinition {

    @And("^new user is created with name \"([^\"]*)\", gender \"([^\"]*)\", email \"([^\"]*)\", status \"([^\"]*)\"$")
    public void newUserIsCreatedWithNameGenderEmailStatus() throws Throwable {
        CommonSteps.sendRequestWithJsonBody();
    }
}
