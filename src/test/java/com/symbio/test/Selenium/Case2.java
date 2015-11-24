package com.symbio.test.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Case2 {
	@FindBy(css = ".ui3-city-change-inner.ui3-control-shadow>span")
	private WebElement selectCityBtn;

	@FindBy(css = "#selCityHotCityId>a[name='北京']")
	private WebElement selectDetialCityBtn;

	@FindBy(css = ".route-item")
	private WebElement route;

	@FindBy(css = ".tab-item.bus-tab")
	private WebElement busBtn;

	@FindBy(css = "#bus_start_input")
	private WebElement start;

	@FindBy(css = "#bus_end_input")
	private WebElement end;

	@FindBy(css = "#busSearchBtn")
	private WebElement searchBtn;

	@FindBy(css = "#select_type")
	private WebElement trafficType;

	@FindBy(css = ".nosubway")
	private WebElement noSubway;

	@FindBy(css = "#type2")
	private WebElement type2;

	@FindBy(css = ".on>div>div>.bus_time")
	private WebElement time;

	WebDriver driver = new FirefoxDriver();
	String URL = "http://map.baidu.com";
	String FromStation = "上第五街";
	String Destination = "故宫";

	@Test
	public void test2() {
		// TODO Auto-generated method stub
		PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 20), this);
		driver.get(URL);
		this.selectCityBtn.click();
		this.selectDetialCityBtn.click();
		this.route.click();
		this.busBtn.click();
		this.start.sendKeys(FromStation);
		this.end.sendKeys(Destination);
		this.searchBtn.click();
		this.trafficType.click();
		this.noSubway.click();
		this.type2.click();
		String useTime = this.time.getText();
		System.out.println(useTime);

	}

}
