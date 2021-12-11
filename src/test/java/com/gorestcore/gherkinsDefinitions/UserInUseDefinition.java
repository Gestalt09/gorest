package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.UserInUseStep;
import cucumber.api.java.en.Then;

public class UserInUseDefinition {

        @Then("^Create a user with email \"([^\"]*)\" already in use$")
    public void CreateUserWithEmailInUse(String email) throws Throwable{
            UserInUseStep.createUserWithExistingEmail(email);

        }
}

