package org.test;

import java.util.List;

import org.Base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day1 extends BaseClass {

	@Test
	private void test() {

		browserLaunch("chrome");
		Maximize();
		dynamicWait(30);
		driver.get("https://www.flipkart.com/");

		 LoginPage l=new LoginPage();
	        click(l.getClose());
	        sendKeys(l.getTextname(), "iphone",Keys.ENTER);
	        List<WebElement> product = l.getProduct();
	        int size = product.size();
	        System.out.println(size);
			for(int i=0;i<product.size();i++) {
		        WebElement webElement = product.get(i);
		        String attribute = webElement.getAttribute("innerText");
		        System.out.println(attribute);

	}
}
}
