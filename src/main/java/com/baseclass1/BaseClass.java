package com.baseclass1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	//browser launch
		public static WebDriver browserLaunch(String option) {
		if (option.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\AdactinNew\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (option.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 //driver=new FireFoxDriver();
		}
		return driver;
		}
		//url
		public static void url(String url) {
		driver.get(url);//url

		}
		//quit
		public static void webquit() {
	driver.quit();
		}
		
	//click
	public static void webClick(WebElement ele) {
		ele.click();

	}
	//sendkeys
	public static void webSend(WebElement ele,String text) {
	ele.sendKeys(text);
	}
	//DROP DOWN
	public static void singleDropDown(String option,String selectby,WebElement elem) {
		  	Select s=new Select(elem);
		if (option.equalsIgnoreCase("selectbyvalue")) {
		
			s.selectByValue(selectby);
		}
		else if (option.equalsIgnoreCase("selectbyvisibletext")) {
			
			s.selectByVisibleText(selectby);
			
		}
		else if (option.equalsIgnoreCase("selectbyindex")) {
		int data = Integer.parseInt(selectby);
		//	s.selectByIndex(Integer.parseInt(selectby));
				s.selectByIndex(data);
			
		}
		else if (option.equalsIgnoreCase("is multiple")) {
		
			s.isMultiple();
		}
		else if (option.equalsIgnoreCase("get option")) {
			
			  List<WebElement> getopt = s.getOptions();
			for (WebElement webElem : getopt) {
				String text = webElem.getText();
				System.out.println(text);
			}
		}
		else if (option.equalsIgnoreCase("getallselectedoptions")) {

			WebElement firstSelop = s.getFirstSelectedOption();
			System.out.println(firstSelop.getText());
		}
		else if (option.equalsIgnoreCase("deselectbyvalue")) {
			s.deselectByValue(selectby);
		}
		else if (option.equalsIgnoreCase("deselectbyvisibletext")) {
			s.deselectByVisibleText(selectby);
		}
		else if (option.equalsIgnoreCase("deselectbyindex")) {
			s.deselectByIndex(Integer.parseInt(selectby));
		}
		else if (option.equalsIgnoreCase("deselectall")) {
			s.deselectAll();
		}
		else if (option.equalsIgnoreCase("getfirstselectoption")) {
			WebElement firstseleopt = s.getFirstSelectedOption();
			System.out.println(firstseleopt.getText());
		}
		
		}
	public static void webClear(WebElement element) {
	element.clear();
	}
	public static void webClose() {
		driver.close();

	}

}
