package com.epam.preproduction.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
<<<<<<< HEAD

	protected WebDriver driver;
=======
	protected static WebDriver driver;
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void refreshLocators() {
		PageFactory.initElements(getDriver(), CataloguePage.class);
	}

	public void goBack() {
		driver.navigate().back();
		refreshLocators();
	}
}
