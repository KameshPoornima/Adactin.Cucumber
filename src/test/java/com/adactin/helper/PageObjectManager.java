package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import Com.cucumber.org.AdactinLoginpage_POM;
import Com.cucumber.org.Adactin_BookaHotal_pom;
import Com.cucumber.org.Adactin_BookingConformation_pom;
import Com.cucumber.org.Adactin_BookingItinerary_pom;
import Com.cucumber.org.Adactin_Searchhotal_POM;
import Com.cucumber.org.Adactin_Selecthotal_Pom;

public class PageObjectManager {
	public static WebDriver driver;
	
	private AdactinLoginpage_POM Alp;
	private Adactin_Searchhotal_POM Asp;
	private Adactin_Selecthotal_Pom Asp2;
	private Adactin_BookaHotal_pom Abp;
	private Adactin_BookingConformation_pom Abcp;
	private Adactin_BookingItinerary_pom Abip;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	
	
	
	public AdactinLoginpage_POM getAlp() {
		Alp= new AdactinLoginpage_POM(driver);
		return Alp;
	}
	public Adactin_Searchhotal_POM getAsp() {
		Asp = new Adactin_Searchhotal_POM(driver);
		return Asp;
	}
	public Adactin_Selecthotal_Pom getAsp2() {
		Asp2 = new Adactin_Selecthotal_Pom(driver);
		return Asp2;
	}
	public Adactin_BookaHotal_pom getAbp() {
		Abp = new Adactin_BookaHotal_pom(driver);
		return Abp;
	}
	public Adactin_BookingConformation_pom getAbcp() {
		Abcp = new Adactin_BookingConformation_pom(driver);
		return Abcp;
	}
	public Adactin_BookingItinerary_pom getAbip() {
		Abip = new Adactin_BookingItinerary_pom(driver);
		return Abip;
	}
	
	

}
