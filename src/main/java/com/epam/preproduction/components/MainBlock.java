package com.epam.preproduction.components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainBlock extends Components {
<<<<<<< HEAD
	
	public static final String BASE_URL = "http://pn.com.ua";
	
	private static final String ITEM_NAME = "name";
	private static final String ITEM_PRICE = "price";
	public static final String DIV_CLASS_ITEM = ".//div[@class='item']";
	public static final String DIV_CLASS_NAME = ".//div[@class='name']/a";
	private static final String PRICE_STRONG = ".//div[@class='price']/strong";
	public static final String CLASS_DESCRIPTION = ".//div[@class='description']";
	public static final String NEXT_PAGE = "pager-next";
=======

	private static final String ITEM_NAME = ".name";
	private static final String ITEM_PRICE = ".price";
	private static final String DIV_CLASS_ITEM = ".//div[@class='item']";
	private static final String DIV_CLASS_NAME = ".//div[@class='name']/a";
	private static final String PRICE_STRONG = ".//div[@class='price']/strong";
	public static final String CLASS_DESCRIPTION = ".//div[@class='description']";
	private static final String NEXT_PAGE = "pager-next";
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	public static final String ACTIVE_NEXT_LINK = "active";

	


<<<<<<< HEAD
	@FindBy(className = ITEM_NAME)
	WebElement productNames;

	@FindBy(className = ITEM_PRICE)
	WebElement productPrices;


	static List<WebElement> divClassName;


	@FindBy(xpath = PRICE_STRONG)
	static
	WebElement priceStrong;
	

	static WebElement nextPage;
	static WebElement activeNextPage;
=======
	@FindBy(css = ITEM_NAME)
	WebElement productNames;

	@FindBy(css = ITEM_PRICE)
	WebElement productPrices;

	@FindBy(xpath = DIV_CLASS_ITEM)
	List<WebElement> divClassItem;

	@FindBy(xpath = PRICE_STRONG)
	WebElement divClassName;

	@FindBy(xpath = DIV_CLASS_NAME)
	WebElement priceStrong;
	
	@FindBy(className = NEXT_PAGE)
	WebElement nextPage;
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	


	public WebElement getProductNames() {
		return productNames;
	}

	public WebElement getProductPrices() {
		return productPrices;
	}

<<<<<<< HEAD
	public static List<WebElement> getDivClassName() {
		return divClassName;
	}


	public static WebElement getPriceStrong() {
		return priceStrong;
	}
	
	public static WebElement getNextPage() {
		return nextPage;
	}
	
	public static WebElement getActiveNextPage() {
		return activeNextPage;
	}
=======
	public List<WebElement> getDivClassItem() {
		return divClassItem;
	}

	public WebElement getDivClassName() {
		return divClassName;
	}

	public WebElement getPriceStrong() {
		return priceStrong;
	}
	
	public WebElement getNextPage() {
		return nextPage;
	}
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	


}
