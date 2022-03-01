package com.mavenforadactin;

import com.baseclass1.BaseClass;
import com.pomclass1.PomClass;
import com.pomclass1.PomClass1;
import com.pomclass1.PomClass2;
import com.pomclass1.PomClass3;
import com.pomclass1.PomClass4;


public class MiniProject extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		url("https://adactinhotelapp.com/");
		PomClass pc=new PomClass(driver);
		webSend(pc.getUsername(),"swethajas");
		webSend(pc.getPassword(),"swetha123");
		webClick(pc.getLogin());
		PomClass1 pc1=new PomClass1(driver);
		singleDropDown("selectbyindex","6",pc1.getLocation());
		singleDropDown("selectbyindex","2", pc1.getHotel());
		singleDropDown("selectbyvisibletext","Super Deluxe",pc1.getRoom());
		Thread.sleep(3000);
		singleDropDown("selectbyindex", "4",pc1.getRoomno());
		webClear(pc1.getDate1());
		webSend(pc1.getDate1(),"27/02/2022");
		webClear(pc1.getDate2());//or use like this if we not create base class for clear pc1.getdate2.clear();
		//pc1.getdate24rr---->refname
		webSend(pc1.getDate2(),"03/03/2022");
		singleDropDown("selectbyindex", "2", pc1.getAdult());
		singleDropDown("selectbyindex","2",pc1.getChildren());
		webClick(pc1.getSubmit());
		PomClass2 pc2=new PomClass2(driver);
		webClick(pc2.getRadio());
		Thread.sleep(3000);
		webClick(pc2.getCon());
		PomClass3 pc3=new PomClass3(driver);
		webSend(pc3.getFirstname(),"swetha");
		webSend(pc3.getLastname(),"jasmine");
		webSend(pc3.getAddress(), "hotel sunshine,123 main road,New York.");
		webSend(pc3.getCardno(), "1234567891234567");
		singleDropDown("selectbyvalue","AMEX",pc3.getCardtype());
		singleDropDown("selectbyvisibletext", "August",pc3.getEdate());
		singleDropDown("selectbyvisibletext", "2022", pc3.getYear());
		webSend(pc3.getCvv(), "123");
		webClick(pc3.getButton());
		Thread.sleep(6000);
		PomClass4 pc4=new PomClass4(driver);
        webClick(pc4.getLogout());
        
	}
}
