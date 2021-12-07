package com.gorestcore.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
    @After("@HookAfterScenrarioExample")
    public static void hookAfterScenrarioExample() throws IOException {
        System.out.println("after scenario hook");
    }

}

