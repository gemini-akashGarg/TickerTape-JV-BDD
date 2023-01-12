package com.qa.TickerTape.StepDefination;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.qa.TickerTape.Locators.Locator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import java.io.IOException;


public class StepDefinition {
    @Given("^Search Stock in the search box (.+)")
    public void Search_Stock_in_the_search_box(String Stock) throws IOException {
        DriverAction.click(By.xpath("//*[@id=\"app-container\"]/div/div[3]/div[2]/div/div/div[1]/div"));
        DriverAction.typeText(Locator.search, Stock);
        DriverAction.waitSec(2);
    }

    @Then("Verify If its Stock Type")
    public void verify_if_its_stock_type() throws IOException {
        DriverAction.click(Locator.stock);
        String verify = DriverAction.getElementText(Locator.stock);
        if (verify.equals("Stock")) {
            System.out.print("Validation successful asset is stock\n");
            GemTestReporter.addTestStep("Validation", "Asset is Stock", STATUS.PASS, DriverAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Validation", "Asset is not Stock", STATUS.FAIL, DriverAction.takeSnapShot());
        }
    }

    @Then("Click on It")
    public void click_on_it() {
        DriverAction.click(Locator.first, "First Result");
        DriverAction.waitSec(1);
    }

    @Then("if pop up appear close it")
    public void remove_popup() {
        DriverAction.click(By.xpath("//*[@id=\"app-container\"]/div/div/div[1]/div/div[1]/div[5]/div[3]/div/button"), "close popup");
        DriverAction.waitSec(1);
    }

    @Then("Show the analytic for one day")
    public void show_the_analytic_for_one_day() throws IOException {
        String heading = DriverAction.getElementText(Locator.heading);
        System.out.println(heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String value = DriverAction.getCSSValue(Locator.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + " for 1 day" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 day", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + " for 1 day" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 day", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(2);
    }

    @Then("Show the analytic for one Week")
    public void show_the_analytic_for_one_week() throws IOException {
        DriverAction.click(Locator.week, "Click on 1w");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String value = DriverAction.getCSSValue(Locator.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + " for 1 Week" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 Week", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + " for 1 Week" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 Week ", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(2);
    }

    @Then("Show the analytic for one Month")
    public void show_the_analytic_for_one_month() throws IOException {
        DriverAction.click(Locator.mo, "Click on 1M");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String value = DriverAction.getCSSValue(Locator.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + " for 1 Month" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 Month", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + " for 1 Month" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 Month", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(2);
    }

    @Then("Show the analytic for one year")
    public void show_the_analytic_for_one_year() throws IOException {
        DriverAction.click(Locator.year, "Click on 1y");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String value = DriverAction.getCSSValue(Locator.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + " for 1 Year" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 Year", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + " for 1 Year" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 1 year", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(2);
    }

    @Then("Show the analytic for five year")
    public void show_the_analytic_for_five_year() throws IOException {
        DriverAction.click(Locator.year5, "Click on 5y");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(Locator.heading);
        String high1 = DriverAction.getElementText(Locator.high);
        String low1 = DriverAction.getElementText(Locator.low);
        String change1 = DriverAction.getElementText(Locator.change);
        String value = DriverAction.getCSSValue(Locator.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + " for 5 Years" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 5 Years", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + " for 5 years" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + " for 5 Years", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(2);
    }
}