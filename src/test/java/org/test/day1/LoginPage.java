package org.test.day1;

import java.util.List;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
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
