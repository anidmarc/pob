package com.pob1.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static Properties prop = null;
	public static WebDriver driver = null;
	
	public Base() {
		
		try {
			prop =  new Properties();
			FileInputStream fis = new FileInputStream("E:\\JAVA Practice\\POB\\src\\main\\java\\com\\pob1\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void intialization() {
		String browseropen = prop.getProperty("browser1");
		
		if(browseropen.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniruddha Dey\\Downloads\\Selenium driver\\ChromeLatest\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aniruddha Dey\\Downloads\\Selenium driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    //driver.manage().timeouts().pageLoadTimeout(, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get(prop.getProperty("url"));
		
	}
}
