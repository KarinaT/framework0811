package com.epam.preproduction.tests;

import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.epam.preproduction.components.FiltersBlock;
import com.epam.preproduction.components.MainBlock;
import com.epam.preproduction.components.NavigationLine;
import com.epam.preproduction.components.SortingLine;
=======
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
import com.epam.preproduction.configuration.DataProviderLayer;
import com.epam.preproduction.helpers.SortingTestHelper;
import com.epam.preproduction.pages.CataloguePage;

public class SortingTest extends TestBase {

	/**
	 * 1. Написать тест, проверяющий функциональность работы сортировки (по цене
	 * и названию) для раздела «Холодильники» (сортировка справа вверху).
	 * Навигация в категорию должна быть выполнена со стартовой страницы.
	 **/
<<<<<<< HEAD
	CataloguePage cataloguePage;
	SortingTestHelper helper;
	SortingLine sortLineBlock;
	MainBlock mainBlock;
	FiltersBlock filterBlock;
	NavigationLine navigationBlock;

	@BeforeMethod
	public void configuration() {
		cataloguePage = new CataloguePage(driver, sortLineBlock, mainBlock,
				navigationBlock);

		helper = new SortingTestHelper(driver, sortLineBlock, mainBlock,
				navigationBlock);
=======

	CataloguePage cataloguePage;
	SortingTestHelper sortingHelper;

	@BeforeMethod
	public void configuration() {
		cataloguePage = PageFactory.initElements(driver, CataloguePage.class);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	}

	@Test(dataProvider = "readFromExcel", dataProviderClass = DataProviderLayer.class)
	public void testSortingByPrice(String productType) throws Exception {

		goToMainPage();
		cataloguePage.selectProductType(productType);
<<<<<<< HEAD
		helper.verifySortingItemsByPrices(cataloguePage);
=======
		sortingHelper.verifySortingItemsByPrices(cataloguePage);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

	}

	@Test(dataProvider = "readFromExcel", dataProviderClass = DataProviderLayer.class)
	public void testSortingByName(String productType) throws Exception {

		goToMainPage();
		cataloguePage.selectProductType(productType);
<<<<<<< HEAD
		helper.verifySortingItemsByNames(cataloguePage);
=======
		sortingHelper.verifySortingItemsByNames(cataloguePage);
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
	}

}
