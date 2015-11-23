package com.practice.della;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MapPage {

	
	@FindBy(css=".ui3-city-change-inner.ui3-control-shadow>i>em")
	private WebElement dropdownbtn;
	
	@FindBy(css="#selCityHotCityId>a[name='上海']")
	private WebElement shanghai;
	
	@FindBy(css=".subway-item")
	private WebElement subway;
	
	@FindBy(css="#sub_start_input")
	private WebElement start;
	
	@FindBy(css="#sub_end_input")
	private WebElement end;
	
	@FindBy(css="#subSearchBtn")
	private WebElement searchbtn;
	
	@FindBy(css="#bus_start_input")
	private WebElement bstart;
	
	@FindBy(css="#bus_end_input")
	private WebElement bend;
	
	@FindBy(css="#busSearchBtn")
	private WebElement bsearchbtn;
	
	@FindBy(css="#btn_uf")
	private WebElement showall;
	
	@FindBy(css=".route-item")
	private WebElement route;
	
	@FindBy(css="#select_type>.droplist")
	private WebElement drop;
	
	@FindBy(css=".nosubway")
	private WebElement nosubway;
	
	@FindBy(css="#type2")
	private WebElement transfer;
	
	@FindBy(css=".bus_time")
	private WebElement time;
	
	static WebDriver driver=new FirefoxDriver();
	public MapPage(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(new AjaxElementLocatorFactory(this.driver,60), this);
	}
		
	public void case1(){
	
		driver.get("http://map.baidu.com");
		this.dropdownbtn.click();
		this.shanghai.click();
		this.subway.click();
		this.start.sendKeys("虹桥1号航站楼");
		this.end.sendKeys("世纪大道");
		this.searchbtn.click();
		this.showall.click();
	}
	
	public void case2(){
		
		driver.get("http://map.baidu.com");
		this.route.click();
		this.bstart.sendKeys("上地五街");
		this.bend.sendKeys("故宫");
		this.bsearchbtn.click();
		this.drop.click();
		this.nosubway.click();
		this.transfer.click();
		System.out.println("Take time:"+this.time.getText());
		
	}
	
//	public static void main( String[] args )
//    {
//		MapPage mp=new MapPage(driver);
//		mp.case2();
//    }
//
	

}
