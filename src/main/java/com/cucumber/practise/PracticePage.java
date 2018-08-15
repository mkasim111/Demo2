package com.cucumber.practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePage {
	WebDriver driver;
	
	

	public PracticePage(WebDriver driver) {
		this.driver = driver;
		
		// PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"hondaradio\"]")
	public WebElement HondaRadioButton;

	@FindBy(xpath = "/html/body/header/div[@class='navbar navbar-fedora navbar-fixed-top bs-docs-nav is-not-signed-in is-at-top']//a[contains(text(),'Login')]")
	public WebElement LoginButton;

	public void clickRadioButton() throws IOException {
		
		waitMethod(By.xpath("//*[@id=\"hondaradio\"]"));
		HondaRadioButton.click();
		
	}

	public LoginPage clickLoginButton() throws IOException, InterruptedException {
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1900);");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1900);");
		LoginButton.click();
		
		return new LoginPage(driver);
	}

	public void waitMethod(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
