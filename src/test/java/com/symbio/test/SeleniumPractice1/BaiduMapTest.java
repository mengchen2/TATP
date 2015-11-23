package com.symbio.test.SeleniumPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbio.test.SeleniumPractice1.PageObj.MainPageObj;

public class BaiduMapTest {

	private WebDriver driver;

	private MainPageObj mainPageObj;

	private String subwayStart = "虹桥1号航站楼";
	private String subwayEnd = "世纪大道";

	private String busStart = "上地五街";
	private String busEnd = "故宫";

	@Test
	public void test1() {
		mainPageObj.goToShanghai();
		mainPageObj.findSubwayPath(subwayStart, subwayEnd);
	}

	@Test
	public void test2() {
		mainPageObj.goToBeijing();
		System.out.println(mainPageObj.findBusPathTime(busStart, busEnd));
	}

	@BeforeClass
	public void initDriver() {
		driver = new FirefoxDriver();
		mainPageObj = new MainPageObj(driver);
	}

	@BeforeMethod
	public void initWebpage() {
		driver.get("http://map.baidu.com");
	}
	
	@AfterClass
	public void destroyDriver(){
		driver.quit();
	}
}
