package com.epam.preproduction.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.preproduction.components.CompareBlock;
import com.epam.preproduction.components.FiltersBlock;
import com.epam.preproduction.components.MainBlock;
import com.epam.preproduction.components.NavigationLine;
import com.epam.preproduction.components.SortingLine;
import com.epam.preproduction.entities.AirConditioner;
import com.epam.preproduction.entities.BreadMaker;
import com.epam.preproduction.entities.Item;
import com.epam.preproduction.entities.Microwave;

public class CataloguePage extends Page {

	// ==== COMPONENTS ==== //

	private SortingLine sortLineBlock;
	private MainBlock mainBlock;
	private FiltersBlock filterBlock;
	private NavigationLine navigationBlock;
<<<<<<< HEAD
	
	public CataloguePage(WebDriver driver, SortingLine sortLineBlock,
			MainBlock mainBlock, NavigationLine navigationBlock) {
		super(driver);

		sortLineBlock = PageFactory.initElements(driver, SortingLine.class);
		mainBlock = PageFactory.initElements(driver, MainBlock.class);
		// filterBlock = PageFactory.initElements(driver, FiltersBlock.class);
		navigationBlock = PageFactory
				.initElements(driver, NavigationLine.class);
=======

	public CataloguePage(WebDriver driver, SortingLine sortLineBlock,
			MainBlock mainBlock, FiltersBlock filterBlock,
			NavigationLine navigationBlock) {
		super(driver);
		this.sortLineBlock = sortLineBlock;
		this.mainBlock = mainBlock;
		this.filterBlock = filterBlock;
		this.navigationBlock = navigationBlock;
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	}

	// ==== GETTERS ==== //

	public SortingLine getSortLineBlock() {
		return sortLineBlock;
	}

	public MainBlock getMainBlock() {
		return mainBlock;
	}

	public FiltersBlock getFilterBlock() {
		return filterBlock;
	}

	public NavigationLine getNavigationBlock() {
		return navigationBlock;
	}

<<<<<<< HEAD
	// ==== GETTING PRODUCT TYPE, CATEGORY ==== //

	public void selectItemCategory(String categoryName) {
		driver.findElement(By.linkText(categoryName)).click();
	}

	public void selectProductType(String productType) {
		driver.findElement(By.linkText(productType)).click();
	}

	public void clickAtPriceFilter() {
		getDriver().findElement(By.xpath(SortingLine.SORT_PRICE)).click();
	}
=======
	// ==== GETTING PRODUCT TYPE ==== //

	public void selectProductType(String productType) {
		driver.findElement(By.linkText(productType)).click();
	}

	

	// =================privates=====================

>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

	public void clickAtNameFilter() {
		getDriver().findElement(By.xpath(SortingLine.SORT_NAME)).click();
	}

<<<<<<< HEAD
	public List<WebElement> getListOfItems() {
		List<WebElement> items = getDriver().findElements(By.xpath(MainBlock.DIV_CLASS_ITEM));
		return items;
=======
	private List<String> getAllManufacturesFromFilter() {
		List<String> result = new ArrayList<String>();
		List<WebElement> manufactures = getDriver()
				.findElements(
						By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/a[@class=' active']"));
		System.out.println(manufactures);
		for (WebElement manufacture : manufactures) {
			result.add(manufacture.getText());
		}

		getDriver()
				.findElement(
						By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/a[17]"))
				.click();
		List<WebElement> hiddenManufactures = getDriver()
				.findElements(
						By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/div[3]/a[@class=' active']"));
		System.out.println(hiddenManufactures);
		for (WebElement manufacture : hiddenManufactures) {
			result.add(manufacture.getText());
		}
		return result;
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	}
	// /6th test

	// public void verifyItemDescription() {
	// List<Item> catItems = new ArrayList<Item>();
	// // надо попасть на каталожну стр
	// List<WebElement> manufactures = driver
	// .findElements(By
	// .xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]"));
	// for (int i = 0; i < 5; i++) {
	// Item item = new AirConditioner();
	// item.setName(manufactures
	// .get(i)
	// .findElement(
	// By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]/div[1]"))
	// .getText());
	// item.setDescription(manufactures
	// .get(i)
	// .findElement(
	// By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]/div[3]"))
	// .getText());
	// catItems.add(item);
	//
	// // надо пройтись по карточкам
	// driver.findElement(
	// By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]/div[1]/a"))
	// .click();
	//
	// }
	// List<Item> items = new ArrayList<Item>();
	//
	// }

<<<<<<< HEAD
=======

	
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
}
