package com.epam.preproduction.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
=======
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.preproduction.components.CompareBlock;
import com.epam.preproduction.components.FiltersBlock;
<<<<<<< HEAD
import com.epam.preproduction.components.MainBlock;
import com.epam.preproduction.components.NavigationLine;
import com.epam.preproduction.components.SortingLine;
=======
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
import com.epam.preproduction.entities.BreadMaker;
import com.epam.preproduction.entities.Item;
import com.epam.preproduction.entities.Microwave;
import com.epam.preproduction.pages.CataloguePage;
import com.epam.preproduction.pages.ComparePage;
import com.epam.preproduction.pages.ItemPage;
import com.epam.preproduction.pages.MainPage;
<<<<<<< HEAD
import com.epam.preproduction.pages.Page;

public class SortingTestHelper extends CataloguePage {

	public SortingTestHelper(WebDriver driver, SortingLine sortLineBlock,
			MainBlock mainBlock, NavigationLine navigationBlock) {
		super(driver, sortLineBlock, mainBlock, navigationBlock);

	}

	public void verifySortingItemsByPrices(CataloguePage cataloguePage) {

		// // getDriver().findElement(By.xpath(SortingLine.SORT_PRICE)).click();
		// //
		// cataloguePage.getSortLineBlock().getSortPrice().findElement(By.xpath(cataloguePage.getSortLineBlock().SORT_PRICE)).click();
		//
		// List<Item> data = new ArrayList<Item>();
		// int pageCount = 0;
		// while (true && pageCount++ < 3) {
		// data.addAll(grabItems());
		// if (hasNext()) {
		// next();
		// } else {
		// break;
		// }
		// }
		// System.out.println(data);
		//
		// int prevPrice = 0;
		// for (Item refrigirator : data) {
		// if (prevPrice > refrigirator.getPrice()) {
		// Assert.fail();
		// }
		// prevPrice = refrigirator.getPrice();
		// }

		getDriver().findElement(By.xpath(SortingLine.SORT_PRICE)).click();
=======

public class SortingTestHelper {

	public void verifySortingItemsByPrices(CataloguePage cataloguePage) {
		cataloguePage.getSortLineBlock().getSortPrice().click();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

		List<Item> data = new ArrayList<Item>();
		int pageCount = 0;
		while (true && pageCount++ < 3) {
<<<<<<< HEAD
			data.addAll(grabItems());
			if (hasNext()) {
				next();
=======
			data.addAll(grabItems(cataloguePage));
			if (hasNext(cataloguePage)) {
				next(cataloguePage);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			} else {
				break;
			}
		}
		System.out.println(data);

		int prevPrice = 0;
		for (Item refrigirator : data) {
			if (prevPrice > refrigirator.getPrice()) {
				Assert.fail();
			}
			prevPrice = refrigirator.getPrice();
		}
	}

	public void verifySortingItemsByNames(CataloguePage cataloguePage) {
<<<<<<< HEAD
		// // cataloguePage.getSortLineBlock().getSortName().click();
		// List<Item> data = new ArrayList<Item>();
		// int pageCount = 0;
		// while (true && pageCount++ < 3) {
		// data.addAll(grabItems());
		// if (hasNext()) {
		// next();
		// } else {
		// break;
		// }
		// }
		// System.out.println(data);
		// List<Item> namesNew = new ArrayList<Item>(data);
		// Collections.sort(namesNew);
		// Assert.assertEquals(data, namesNew);
		getDriver().findElement(By.xpath(SortingLine.SORT_NAME)).click();
		List<Item> data = new ArrayList<Item>();
		int pageCount = 0;
		while (true && pageCount++ < 3) {
			data.addAll(grabItems());
			if (hasNext()) {
				next();
=======
		cataloguePage.getSortLineBlock().getSortName().click();
		List<Item> data = new ArrayList<Item>();
		int pageCount = 0;
		while (true && pageCount++ < 3) {
			data.addAll(grabItems(cataloguePage));
			if (hasNext(cataloguePage)) {
				next(cataloguePage);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			} else {
				break;
			}
		}
		System.out.println(data);
		List<Item> namesNew = new ArrayList<Item>(data);
		Collections.sort(namesNew);
		Assert.assertEquals(data, namesNew);

	}

<<<<<<< HEAD
	public List<Item> grabItems() {
		// List<Item> result = new ArrayList<Item>();
		// List<WebElement> items = new ArrayList<WebElement>();
		// items.addAll(getListOfItems());
		//
		// for (WebElement item : items) {
		// BreadMaker breadMaker = new BreadMaker();
		// String name = ((WebElement) MainBlock.getDivClassName()).getText();
		// int price = extratNumbers(MainBlock.getPriceStrong().getText());
		//
		// String description = item.findElement(
		// By.xpath(MainBlock.CLASS_DESCRIPTION)).getText();
		// breadMaker.setName(name);
		// breadMaker.setPrice(price);
		// breadMaker.setDescription(description);
		// result.add(breadMaker);
		// }
		// return result;
		List<Item> result = new ArrayList<Item>();

		WebElement catalog = getDriver().findElement(
				By.xpath("//div[@class='catalog']"));
		List<WebElement> items = catalog.findElements(By
				.xpath(".//div[@class='item']"));

		for (WebElement item : items) {
			BreadMaker breadMaker = new BreadMaker();
			String name = item.findElement(By.xpath(".//div[@class='name']/a"))
					.getText();
			int price = extratNumbers(item.findElement(
					By.xpath(".//div[@class='price']/strong")).getText());
			String description = item.findElement(
					By.xpath(".//div[@class='description']")).getText();
=======
	public List<Item> grabItems(CataloguePage cataloguePage) {
		List<Item> result = new ArrayList<Item>();
		List<WebElement> items = cataloguePage.getMainBlock().getDivClassItem();

		for (WebElement item : items) {
			BreadMaker breadMaker = new BreadMaker();
			String name = cataloguePage.getMainBlock().getDivClassName()
					.getText();
			int price = extratNumbers(cataloguePage.getMainBlock()
					.getPriceStrong().getText());

			String description = item.findElement(
					By.xpath(cataloguePage.getMainBlock().CLASS_DESCRIPTION))
					.getText();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			breadMaker.setName(name);
			breadMaker.setPrice(price);
			breadMaker.setDescription(description);
			result.add(breadMaker);
		}
		return result;
	}

	private Integer extratNumbers(String price) {
		Integer pr = Integer.valueOf(price.substring(0, price.length() - 4)
				.replace(" ", ""));
		return pr;
	}

<<<<<<< HEAD
	private boolean hasNext() {
		// WebElement element = MainBlock.getNextPage().findElement(
		// By.className(MainBlock.NEXT_PAGE));
		// if (!CollectionUtils.isEmpty(element.findElements(By
		// .className(MainBlock.ACTIVE_NEXT_LINK)))) {
		// return true;
		// }
		// return false;
		WebElement element = getDriver()
				.findElement(By.className("pager-next"));
		if (!CollectionUtils.isEmpty(element.findElements(By
				.className("active")))) {
=======
	private boolean hasNext(CataloguePage cataloguePage) {
		WebElement element = cataloguePage.getMainBlock().getNextPage();
		if (!CollectionUtils.isEmpty(element.findElements(By
				.className(cataloguePage.getMainBlock().ACTIVE_NEXT_LINK)))) {
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			return true;
		}
		return false;
	}

<<<<<<< HEAD
	private void next() {
		// WebElement element = MainBlock.getNextPage().findElement(
		// By.className(MainBlock.NEXT_PAGE));
		// if (!CollectionUtils.isEmpty(element.findElements(By
		// .className(MainBlock.ACTIVE_NEXT_LINK)))) {
		// MainBlock.getActiveNextPage()
		// .findElement(By.className(MainBlock.ACTIVE_NEXT_LINK))
		// .click();
		// }
		WebElement element = getDriver()
				.findElement(By.className("pager-next"));
		if (!CollectionUtils.isEmpty(element.findElements(By
				.className("active")))) {
			element.findElement(By.className("active")).click();
		}
	}

	public void verifyFilterWeightControlParameter(CataloguePage cataloguePage) {

		cataloguePage
				.getFilterBlock()
				.getSearchParameter()
				.findElement(
						By.xpath(FiltersBlock.getFunction(cataloguePage
								.getFilterBlock().SEARCH_PARAMETER))).click();

		List<Item> filteredBreadMakersList = new ArrayList<Item>();
		while (true) {
			filteredBreadMakersList.addAll(grabItems());
			if (hasNext()) {
				next();
=======
	private void next(CataloguePage cataloguePage) {
		WebElement element = cataloguePage.getMainBlock().getNextPage();
		if (!CollectionUtils.isEmpty(element.findElements(By
				.className(cataloguePage.getMainBlock().ACTIVE_NEXT_LINK)))) {
			element.findElement(
					By.className(cataloguePage.getMainBlock().ACTIVE_NEXT_LINK))
					.click();
		}
	}

	public void checkFilterWeightControlParameterForBreadMaker(
			CataloguePage cataloguePage) {
		// get bread makers by filter

		// getDriver().findElement(By.xpath(FiltersBlock.getFunction(searchParameter))).click();

		cataloguePage.getFilterBlock().getFunction(
				FiltersBlock.SEARCH_PARAMETER);

		List<Item> filteredBreadMakersList = new ArrayList<Item>();
		while (true) {
			filteredBreadMakersList.addAll(grabItems(cataloguePage));
			if (hasNext(cataloguePage)) {
				next(cataloguePage);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			} else {
				break;
			}
		}
		System.out.println(filteredBreadMakersList);

<<<<<<< HEAD
=======
		// check if filtered bread makers contains required filter
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
		for (Item breadMaker : filteredBreadMakersList) {
			if (!breadMaker.getDescription().contains(
					FiltersBlock.SEARCH_PARAMETER)) {
				Assert.fail();
			}
		}
	}

<<<<<<< HEAD
	public void cverifyManufacturerInNames(CataloguePage cataloguePage) {
		List<Item> allBreadMakersList = new ArrayList<Item>();
		while (true) {
			allBreadMakersList.addAll(grabItems(cataloguePage));
			if (hasNext()) {
				next();
=======
	public void checkManufacturerInNamesForBreadMakers(
			CataloguePage cataloguePage) {
		List<Item> allBreadMakersList = new ArrayList<Item>();
		while (true) {
			allBreadMakersList.addAll(grabItems(cataloguePage));
			if (hasNext(cataloguePage)) {
				next(cataloguePage);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			} else {
				break;
			}
		}
		System.out.println(allBreadMakersList);

<<<<<<< HEAD
		List<String> manufacturerNames = getAllManufacturesFromFilter(cataloguePage);
=======
		List<String> manufacturerNames = getAllManufacturesFromFilter();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
		boolean exist = false;
		for (Item breadMaker : allBreadMakersList) {
			for (String manufacturer : manufacturerNames) {
				if (breadMaker.getName().toLowerCase()
						.contains(manufacturer.toLowerCase())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				Assert.fail();
			} else {
				exist = false;
			}
		}
	}

<<<<<<< HEAD
	public void verifyPriceFilter(double minPrice, double maxPrice,
			CataloguePage cataloguePage) {
		List<Item> allMachines = new ArrayList<Item>();
		while (true) {
			allMachines.addAll(grabItems(cataloguePage));
			if (hasNext(cataloguePage)) {
				next(cataloguePage);
=======
	public void checkPriceFilterForWashingMachines(double minPrice,
			double maxPrice) {
		// int maxPrice = 7000;
		// int minPrice = 6000;

		List<Item> allMachines = new ArrayList<Item>();
		while (true) {
			allMachines.addAll(grabItems());
			if (hasNext()) {
				next();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			} else {
				break;
			}
		}
		System.out.println(allMachines.size());
		System.out.println(allMachines);
<<<<<<< HEAD

		cataloguePage
				.getFilterBlock()
				.getHighPrice()
				.findElement(
						By.xpath(cataloguePage.getFilterBlock().getMaxPrice(
								(int) maxPrice))).click();
		cataloguePage
				.getFilterBlock()
				.getLowPrice()
				.findElement(
						By.xpath(cataloguePage.getFilterBlock().getMinPrice(
								(int) minPrice))).click();

		// cataloguePage.refreshLocators();
		List<Item> allFitredMachines = new ArrayList<Item>();
		while (true) {
			allFitredMachines.addAll(grabItems(cataloguePage));
			if (hasNext(cataloguePage)) {
				next(cataloguePage);
=======
		getDriver().findElement(
				By.xpath(FiltersBlock.getMaxPrice((int) maxPrice))).click();
		getDriver().findElement(
				By.xpath(FiltersBlock.getMinPrice((int) minPrice))).click();
		refreshLocators();
		List<Item> allFitredMachines = new ArrayList<Item>();
		while (true) {
			allFitredMachines.addAll(grabItems());
			if (hasNext()) {
				next();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			} else {
				break;
			}
		}
		System.out.println(allFitredMachines.size());
		System.out.println(allFitredMachines);

		for (Item machine : allFitredMachines) {
<<<<<<< HEAD

=======
			System.out.println("====>" + machine + "(" + machine.hashCode()
					+ ")");
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
			if (machine.getPrice() > maxPrice || machine.getPrice() < minPrice) {
				Assert.fail();
			}
		}

<<<<<<< HEAD
		String totalFilteredItems = cataloguePage.getFilterBlock()
				.getFilteredItemsCount().getText();
=======
		String totalFilteredItems = getDriver().findElement(
				By.xpath(FiltersBlock.FILTERED_ITEMS_COUNT)).getText();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

		for (Item machine : allMachines) {
			if (machine.getPrice() <= maxPrice
					&& machine.getPrice() >= minPrice) {
<<<<<<< HEAD
=======
				// if (!allFitredMachines.contains(machine)) {
				// Assert.fail();
				// }

>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
				Assert.assertTrue(allFitredMachines.size() == Integer
						.parseInt(totalFilteredItems));

			}
		}

	}

<<<<<<< HEAD
	private List<String> getAllManufacturesFromFilter(
			CataloguePage cataloguePage) {
		List<String> result = new ArrayList<String>();
		List<WebElement> manufactures = cataloguePage.getFilterBlock()
				.getProducerFilter();

		System.out.println(manufactures);
		for (WebElement manufacture : manufactures) {
			result.add(manufacture.getText());
		}

		cataloguePage.getFilterBlock().getCommonProducerFilters().click();
		List<WebElement> hiddenManufactures = cataloguePage.getFilterBlock()
				.getRestProducerFilter();
		System.out.println(hiddenManufactures);
		for (WebElement manufacture : hiddenManufactures) {
			result.add(manufacture.getText());
		}
		return result;
	}

	public void checkParameters(MainPage mainPage, ItemPage itemPage,
			ComparePage comparePage) {

		mainPage.getCompareBlock().getFirstCompareElement().click();
		mainPage.getCompareBlock().getCompareItemsLink().click();

		Microwave firstMicrowave = itemPage.grabAllCharacteristics();
		System.out.println(firstMicrowave.getCharacteristics());
		mainPage.goBack();

		mainPage.getCompareBlock().getSecondCompareItem().click();
		mainPage.getCompareBlock().getCompareItemsLink().click();

		Microwave secondMicrowave = itemPage.grabAllCharacteristics();

		System.out.println(secondMicrowave.getCharacteristics());

		Set<String> paramsNames = comparePage.grabAllParamNames();
		Set<String> names1 = secondMicrowave.getCharacteristics().keySet();
		Set<String> names2 = secondMicrowave.getCharacteristics().keySet();
=======
	public void checkParameters() {
		getDriver().findElement(By.xpath(MainPage.FIRST_ITEM)).click();
		getDriver().findElement(By.xpath(MainPage.COMPARE)).click();
		ItemPage itemPage1 = PageFactory.initElements(getDriver(),
				ItemPage.class);

		Microwave microwave1 = itemPage1.grabAllCharacteristics();

		System.out.println(microwave1.getCharacteristics());
		getDriver().navigate().back();
		refreshLocators();

		getDriver().findElement(By.xpath(MainPage.SECOND_ITEM)).click();
		getDriver().findElement(By.xpath(MainPage.COMPARE)).click();
		ItemPage itemPage2 = PageFactory.initElements(getDriver(),
				ItemPage.class);
		Microwave microwave2 = itemPage2.grabAllCharacteristics();

		System.out.println(microwave2.getCharacteristics());

		getDriver().findElement(By.xpath(MainPage.COMPARE_GOODS)).click();

		ComparePage comparePage = PageFactory.initElements(getDriver(),
				ComparePage.class);

		Set<String> paramsNames = comparePage.grabAllParamNames();
		Set<String> names1 = microwave1.getCharacteristics().keySet();
		Set<String> names2 = microwave2.getCharacteristics().keySet();
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

		System.out.println(paramsNames);
		System.out.println(names1);
		System.out.println(names2);
		if (!paramsNames.containsAll(names1)) {
			Assert.fail();
		}
		if (!paramsNames.containsAll(names2)) {
			Assert.fail();
		}

<<<<<<< HEAD
		WebElement table = mainPage.getCompareBlock().getCompareClass();
=======
		WebElement table = getDriver().findElement(
				By.className(CompareBlock.CLASS_COMPARE));
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
		List<WebElement> differentItems = table.findElements(By
				.className(CompareBlock.DIFFERENT));
		for (WebElement item : differentItems) {
			List<WebElement> tds = item.findElements(By
					.tagName(CompareBlock.TD_COMPARE));
			for (WebElement td : tds) {
				if (!td.getCssValue(CompareBlock.BACKGROUND_COLOR)
						.equalsIgnoreCase(CompareBlock.BG_VALUE)) {
					Assert.fail();
				}
			}

		}
	}

<<<<<<< HEAD
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
	}

>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
}
