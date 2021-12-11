package com.gorestcore.gherkinsDefinitions;

import com.gorestcore.serenitySteps.CommonSteps;
import com.gorestcore.serenitySteps.RemoveUserStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class RemoveDefinition {

        @Then("^Remove user$")
        public void deleteUser() throws Exception {
          RemoveUserStep.RemoveExistedUser();

        }

    @And("^Remove the already removed user \"([^\"]*)\"$")
    public void removeTheAlreadyRemovedUser(String user) throws Throwable {
            RemoveUserStep.RemoveAlreadyRemovedUser(user);

    }
}

