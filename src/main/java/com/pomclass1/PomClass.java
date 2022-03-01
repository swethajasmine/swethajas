package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	public WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;
	public WebElement getUsername() {
			return username;
		}
		public PomClass(WebDriver abc) {
			this.driver=abc;
			PageFactory.initElements(driver,this);
			
		}
//		WebElement password = driver.findElement(By.id("password"));
		@FindBy(id = "password")
		private WebElement password;

		public WebElement getPassword() {
			return password;
		}
//		WebElement login = driver.findElement(By.id("login"));
		@FindBy(id = "login")
		private WebElement login;

		public WebElement getLogin() {
			return login;
		}
		

}
