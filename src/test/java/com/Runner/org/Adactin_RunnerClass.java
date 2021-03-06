package com.Runner.org;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;

import Com.cucumber.org.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature\\org\\adactin.feature",
glue = "\\com\\Stepdefinition\\org",
plugin="pretty",
dryRun=false,
monochrome=false)

public class Adactin_RunnerClass extends BaseClass {
	public static WebDriver driver;
	

	@BeforeClass
	public static void setup() throws IOException {
    String broswerName = FileReaderManager.getInstance().gecrtInstance().getBroswerName();
	driver=BaseClass.BroswerLanch(broswerName);

	}
	@AfterClass
	public static void teardown() {
		driver.close();
		driver.quit();

	}	

	
	
	

}
