package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass1 {
	//search hotel
//	WebElement location = driver.findElement(By.id("location"));
	@FindBy(id = "location")
	private WebElement location;
	private WebDriver driver;
	

	public WebElement getLocation() {
		return location;
	}
public PomClass1(WebDriver abc) {
	this.driver=abc;
	PageFactory.initElements(driver,this);
}
//WebElement hotel = driver.findElement(By.id("hotels"));
@FindBy(id = "hotels")
private WebElement hotel;


public WebElement getHotel() {
	return hotel;
}
//WebElement room = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
private WebElement room;


public WebElement getRoom() {
	return room;
}
//WebElement roomno = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
private WebElement roomno;

public WebElement getRoomno() {
	return roomno;
}
//WebElement date1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
@FindBy(xpath = "(//input[@type='text'])[2]")
private WebElement date1;


public WebElement getDate1() {
	return date1;
}
//WebElement date2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
@FindBy(xpath = "(//input[@type='text'])[3]")
private WebElement date2;


public WebElement getDate2() {
	return date2;
}
//WebElement adult = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
private WebElement adult;


public WebElement getAdult() {
	return adult;
}
//WebElement children = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
private WebElement children;


public WebElement getChildren() {
	return children;
}
//WebElement submit = driver.findElement(By.id("Submit"));
@FindBy(id = "Submit")
private WebElement submit;


public WebElement getSubmit() {
	return submit;
}

}
