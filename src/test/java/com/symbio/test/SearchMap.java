package com.symbio.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;


public class SearchMap {
	@FindBy(css=".ui3-city-change-inner.ui3-control-shadow>span")
	private WebElement openCity;
	
	@FindBy(css="#selCityHotCityId [name='上海']")
	private WebElement selectCity;
	
	@FindBy(css=".subway-item")
	private WebElement subwaySelect;
	
	@FindBy(id="sub_start_input")
	private WebElement originName;
	
	@FindBy(id="sub_end_input")
	private WebElement destinationName; 
	
	@FindBy(id="subSearchBtn")
	private WebElement searchButton;
	
	@FindBy(id="busSearchBtn")
	private WebElement searchbuttonBus;
	
	@FindBy(id="btn_uf")
	private WebElement unfoldButton; 
	
	@FindBy(css="#selCityHotCityId [name='北京']")
	private WebElement selectCity2;
	
	@FindBy(css=".route-item")
	private WebElement busRoute; 
	
	@FindBy(css=".tab-item.bus-tab")
	private WebElement busTab;
	
	@FindBy(id="bus_start_input")
	private WebElement originName2;
	
	@FindBy(id="bus_end_input")
	private WebElement destinationName2; 
	
	@FindBy(css="#select_type")
	private WebElement trafficType;
	
	@FindBy(css=".nosubway")
	private WebElement noSubway;
	
	@FindBy(id="type2")
	private WebElement busType;
	
	@FindBy(css=".bus_time")
	private WebElement busTime;
	
	@Test
	public void HomePageBaidu() {
		WebDriver driver =new FirefoxDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		driver.get("http://map.baidu.com");
		this.openCity.click();
		this.selectCity.click();
		this.subwaySelect.click();
		this.originName.sendKeys("虹桥1号航站楼");
		this.destinationName.sendKeys("世纪大道");
		this.searchButton.click();
		this.unfoldButton.click();	
		this.originName.sendKeys("虹桥1号航站楼");
		//Second test Case 
		this.openCity.click();
		this.selectCity2.click();
		this.busRoute.click();
		this.busTab.click();
		this.originName2.sendKeys("上地五街");
		this.destinationName2.sendKeys("故宫博物院");
		this.searchbuttonBus.click();
		this.trafficType.click();
		this.noSubway.click();
		this.busType.click();
		String busTimeResult = this.busTime.getText();
		System.out.println(busTimeResult);
	}

}
