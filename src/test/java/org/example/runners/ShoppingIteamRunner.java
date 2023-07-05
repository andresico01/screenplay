package org.example.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/appShopping.feature",
        glue = "org.example.stepdefinitions",
        tags = "@SUCCESS_SELECT_ITEAM",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ShoppingIteamRunner {
}
