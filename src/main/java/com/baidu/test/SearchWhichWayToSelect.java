package com.baidu.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SearchWhichWayToSelect {
	
	private WebDriver dr = new FirefoxDriver();
//	private WebDriverWait wait = new WebDriverWait(dr,80000);

	@FindBy(css = ".ui3-city-change-inner.ui3-control-shadow")
	private WebElement city;
	
	@FindBy(css = "a[name='�Ϻ�']")
	private WebElement shangHaiCityItem;
	
	@FindBy(css = "a[name='����']")
	private WebElement beiJingCityItem;
	
	@FindBy(css = ".subway-item")
	private WebElement subWay;
	
	@FindBy(id = "route_menu")
	private WebElement routeMenu;
	
	@FindBy(css = ".route_menu")
	private WebElement bus;
	
	@FindBy(id = "bus_start_input")
	private WebElement bus_start;
	
	@FindBy(id = "bus_end_input")
	private WebElement bus_end;
	
	@FindBy(id = "sub_start_input")
	private WebElement startFrom;
	
	@FindBy(id = "sub_end_input")
	private WebElement endFrom;
	
	@FindBy(id = "busSearchBtn")
	private WebElement busSearchButton;
	
	@FindBy(id = "subSearchBtn")
	private WebElement searchButton;
	
	@FindBy(id = "btn_uf")
	private WebElement detailButton;
	
	@FindBy(css = "#routes_detail")
	private WebElement detail;
	
	@FindBy(css = "#select_type")
	private WebElement trafficType;// ���ﲻ����css = .traffic_type ��λ,�����ʱ������¼���������
	
	@FindBy(css = ".nosubway")
	private WebElement noSubWay;
	
	@FindBy(css = "#scheme_0 .bus_time")
	private WebElement FirstItemBusTime;

	public SearchWhichWayToSelect() {
		PageFactory.initElements(dr, this);
	}
	@Test
	public void test() throws InterruptedException {
		dr.get("http://map.baidu.com/");
		Thread.sleep(20000);
		this.city.click();
		Thread.sleep(3000);
		this.shangHaiCityItem.click();
		Thread.sleep(3000);
		this.subWay.click();
		Thread.sleep(3000);
		this.startFrom.sendKeys("�Ϻ���ѧ");
		Thread.sleep(3000);
		this.endFrom.sendKeys("½����");
		Thread.sleep(3000);
		this.searchButton.click();
		Thread.sleep(3000);
		this.detailButton.click();
		Thread.sleep(8000);
		System.out.println(this.detail.getText());
		Thread.sleep(9000);
	

	}

	@Test
	public void test2() throws InterruptedException {
		dr.get("http://map.baidu.com/");
		Thread.sleep(20000);
		this.city.click();
		Thread.sleep(3000);
		this.beiJingCityItem.click();
		Thread.sleep(10000);
		this.routeMenu.click();
		Thread.sleep(3000);
		this.bus_start.sendKeys("�ϵ����");
		Thread.sleep(3000);
		this.bus_end.sendKeys("�ʹ�");
		Thread.sleep(3000);
		this.busSearchButton.click();
		Thread.sleep(30000);
		this.trafficType.click();
		
		Thread.sleep(8000);
		this.noSubWay.click();
		Thread.sleep(9000);
		System.out.println(this.FirstItemBusTime.getText());
		
	}
	@AfterClass
	public void afterClass(){
		dr.close();
	}
	
	// @Test
	// public void test3() throws InterruptedException{
	// this.test2();
	// }

}
