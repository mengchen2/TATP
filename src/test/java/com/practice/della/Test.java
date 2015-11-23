package com.practice.della;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	WebDriver driver=new FirefoxDriver();
	MapPage mp=new MapPage(driver);
	
	@org.testng.annotations.Test
	public void test1(){
		
	    mp.case1();
	}
	
	
	@org.testng.annotations.Test
	public void test2(){

	    mp.case2();
	}

}
