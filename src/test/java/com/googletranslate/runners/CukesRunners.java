package com.googletranslate.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/recource/features",
        glue="com.googletranslate.step_definitions",
        dryRun=false)
public class CukesRunners {







}
