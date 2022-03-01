package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass2 {
	//select hotel
//	WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio;
	private WebDriver driver;

	public WebElement getRadio() {
		return radio;
	}
	public PomClass2(WebDriver abc) {
		this .driver=abc;
		
		PageFactory.initElements(driver,this);
	}
//	WebElement con = driver.findElement(By.id("continue"));
	@FindBy(id = "continue")
	private WebElement con;

	public WebElement getCon() {
		return con;
	}

}
