package org.test;

import java.util.List;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	@FindBy(name="q")
	private WebElement textname;
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private List<WebElement> product;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> price;

	public WebElement getTextname() {
		return textname;
	}

	public WebElement getClose() {
		return close;
	}

	public List<WebElement> getProduct() {
		return product;
	}

	public List<WebElement> getPrice() {
		return price;
	}

	
	
	
	
	}
