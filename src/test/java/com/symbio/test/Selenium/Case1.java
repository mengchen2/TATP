package com.symbio.test.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class Case1 {
	@FindBy(css = ".ui3-city-change-inner.ui3-control-shadow>span")
	private WebElement selectCityBtn;

	@FindBy(css = "#selCityHotCityId>a[name='上海']")
	private WebElement selectDetialCityBtn;

	@FindBy(css = ".subway-item>img")
	private WebElement subway;

	@FindBy(css = "#sub_start_input")
	private WebElement start;

	@FindBy(css = "#sub_end_input")
	private WebElement end;

	@FindBy(css = "#subSearchBtn")
	private WebElement searchBtn;

	@FindBy(css = "#btn_uf")
	private WebElement expandResult;

	WebDriver driver = new FirefoxDriver();
	String URL = "http://map.baidu.com";
	String FromStation = "虹桥1号航站楼";
	String Destination = "世纪大道";

	@Test
	public void test1() {
		// TODO Auto-generated method stub
		PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 20), this);
		driver.get(URL);
		this.selectCityBtn.click();
		this.selectDetialCityBtn.click();
		this.subway.click();
		this.start.sendKeys(FromStation);
		this.end.sendKeys(Destination);
		this.searchBtn.click();
		this.expandResult.click();

	}

}
