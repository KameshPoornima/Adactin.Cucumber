package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	
	public ConfigurationReader() throws IOException {
		File f =new File("src\\test\\java\\com\\adactinProperty\\org\\adactin.property");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
		
	}
	
	public String getBroswerName() {
		String Broswer = ps.getProperty("BroswerName");
		return Broswer;
	}
	
	public String getUrl() {
		String url = ps.getProperty("url");
		return url;
	}

	public String getFriestName() {
		String fristname = ps.getProperty("FristName");
		return fristname;

	}
	
	public String getLastName() {
		String lastname = ps.getProperty("LastName");
		return lastname;
	}
	
	public String getcvv() {
		String cvv = ps.getProperty("Cvv");
		return cvv;
	}
	
	public String getCreditCard() {
		String Creditcard = ps.getProperty("CredirCardNo");
		return Creditcard;
	}
	
	public String getAddress() {
		String address = ps.getProperty("Address");
		return address;
	}
	
	public String getContactNo() {
		String ContactNo = ps.getProperty("ContactNO");
		return ContactNo;
	}
	
}
