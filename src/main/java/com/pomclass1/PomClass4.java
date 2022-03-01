package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass4 {
	@FindBy(id = "logout")
	private WebElement logout;
	private WebDriver driver;

	public WebElement getLogout() {
		return logout;
	}
	public PomClass4(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver,this);
	}


}
