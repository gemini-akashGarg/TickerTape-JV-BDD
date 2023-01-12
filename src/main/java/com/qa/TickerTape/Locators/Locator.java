package com.qa.TickerTape.Locators;

import org.openqa.selenium.By;

public class Locator {

    public static By search = By.xpath("//input[@type='search']");

    public static By stock = By.xpath("//button[text()='Stock']");

    public static By first = By.xpath("//ul[@role='listbox']//li[1]");

    public static By heading = By.xpath("//*[@data-section-tag='investmentChecklist']//h1");

    public static By high = By.xpath("//div[text()='High']/following-sibling::div");

    public static By low = By.xpath("//div[text()='Low']/following-sibling::div");

    public static By change = By.xpath("//div[text()='Returns']/following-sibling::div");

    public static By week = By.xpath("//*[@class='jsx-3185172001 chart-scope-picker-root desktop--only']//input[@value='1w']");

    public static By mo = By.xpath("//*[@class='jsx-3185172001 chart-scope-picker-root desktop--only']//input[@value='1mo']");

    public static By year = By.xpath("//*[@class='jsx-3185172001 chart-scope-picker-root desktop--only']//input[@value='1y']");

    public static By year5 = By.xpath("//*[@class='jsx-3185172001 chart-scope-picker-root desktop--only']//input[@value='5y']");
}
