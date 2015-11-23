package com.practice.bruce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaiduMapBruce {

    //case1
	@FindBy(css=".subway-item>img")
	private WebElement subway;
	
    @FindBy(css=".arrow-flag.down")
    private WebElement cityList1;
    
    @FindBy(css=".city_cont>a[data-cname='上海']")
    private WebElement cityShangHai;
      
    @FindBy(css="#sub_start_input")
    private WebElement start;
	
    @FindBy(css="#sub_end_input")
    private WebElement end;  
    
    @FindBy(css="#subSearchBtn")
    private WebElement search;
    
    @FindBy(css="#btn_uf")
    private WebElement expand;
    
    
    
    //case2
    @FindBy(css=".ui3-city-change-inner.ui3-control-shadow>i>em")
    private WebElement cityList2;
    
    @FindBy(css="#selCityHotCityId>a[name='北京']")
    private WebElement cityBeiJing;
    
    @FindBy(css=".route-item")
    private WebElement route;

    //
    @FindBy(css=".tab-item.bus-tab>.border-line>span")
    private WebElement bus;
    
    @FindBy(css="#bus_start_input")
    private WebElement busStart; 
    
    @FindBy(css="#bus_end_input")
    private WebElement busEnd;
    
    @FindBy(css="#busSearchBtn")
    private WebElement busSearch;
    
    @FindBy(css="#select_type>.droplist")
    private WebElement toolsChoose;
    
    @FindBy(css=".nosubway")
    private WebElement noSubway;
    
    @FindBy(css="#type2")
    private WebElement lessChange;
    
    //
    @FindBy(css="#scheme_0>.route-head>.bus_time")
    private WebElement busTime;
       
    private WebDriver driver;
	private WebDriverWait wait;
    
    
    public static void main(String[] args) {
    	
    	BaiduMapBruce bmr = new BaiduMapBruce();
    	bmr.testSearch1();
    	bmr.testSearch2();
    	
    }
    
	public void waitToPresent(int seconds, WebElement element) {
		wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
    
    public void testSearch1() {
       	driver = new FirefoxDriver();
    	driver.get("http://map.baidu.com");
       	PageFactory.initElements(driver, this);
       	
    	subway.click();
    	cityList1.click();
    	cityShangHai.click();
    	start.sendKeys("虹桥2号航站楼");
    	this.end.sendKeys("世纪大道");
    	search.click();
    	waitToPresent(10, expand);
    	expand.click();
    }
    
    public void testSearch2() {
       	driver = new FirefoxDriver();
       	driver.get("http://map.baidu.com");
       	PageFactory.initElements(driver, this);
       	
    	cityList2.click();
    	
       	waitToPresent(10, cityBeiJing);
       	cityBeiJing.click();
       	route.click();
       	bus.click();
       	busStart.sendKeys("上地五街");
       	busEnd.sendKeys("故宫博物院");
       	busSearch.click();
       	
       	waitToPresent(10, toolsChoose);
       	toolsChoose.click();
       	noSubway.click();
       	lessChange.click();
       	
       	System.out.println(busTime.getText());      	
    }
    
    
    
    
}
