package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass3 {
	//Book A hotel
		//WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		@FindBy(xpath = "(//input[@type='text'])[11]")
		private WebElement firstname;
		private WebDriver driver;

		public WebElement getFirstname() {
			return firstname;
		}
		public PomClass3(WebDriver abc) {
			this.driver=abc;
			PageFactory.initElements(driver,this);
		}
		//WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		@FindBy(xpath = "(//input[@type='text'])[12]")
		private WebElement lastname;

		public WebElement getLastname() {
			return lastname;
		}
		//WebElement address = driver.findElement(By.id("address"));
		@FindBy(id = "address")
		private WebElement address;

		public WebElement getAddress() {
			return address;
		}
//		WebElement cardno = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		@FindBy(xpath ="(//input[@type='text'])[13]")
		private WebElement cardno;

		public WebElement getCardno() {
			return cardno;
		}
//		WebElement cardtype = driver.findElement(By.xpath("//select[@class='select_combobox']"));
	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	//WebElement edate = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
	@FindBy(xpath = "(//select[@class='select_combobox2'])[1]")
	private WebElement edate;

	public WebElement getEdate() {
		return edate;
	}
	//WebElement year = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
	@FindBy(xpath ="(//select[@class='select_combobox2'])[2]" )
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	//WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
	@FindBy(xpath ="(//input[@type='text'])[14]" )
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	//WebElement button = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}

}
