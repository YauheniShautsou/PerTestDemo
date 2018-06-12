package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "SearchTests", "First"})
public class ST12_NewSearch extends SampleTest {

	@Test
	public void newSearch() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.selectFilter1Bed();
		user.atSearchPage.setUpFilterFirepace();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.clickOnMap();
		user.atMapPage.clickOnNotNowButton();
		user.atMapPage.clickOnMyNewSearch();
		user.atSearchPage.selectFilter1AndHalfBath();
		user.atSearchPage.clickOnApplyButton();
		user.atPerchwellPage.clickOnAnalytics();
		user.atRebnyListingsPage.addChartFromREBNYSection();
		user.atAnalyticsPage.skipHints();
		user.atAnalyticsPage.addButtonClick();
		user.atAcrisClosingPage.addChartFromACRISSection();
		user.atAnalyticsPage.addButtonClick();
		user.atNycTownhousesPage.addChartFromNYCSection();
		user.atAnalyticsPage.addButtonClick();
		user.atManagementPage.addChartFromManagementSection();
		user.atAnalyticsPage.addButtonClick();
		user.atRebnyListingsPage.addBedroomsChartFromREBNYListings();
		user.atAnalyticsPage.addButtonClick();
		user.atAcrisClosingPage.addBuildingTypeByDealCountChartFromACRISClosing();
		user.atAnalyticsPage.clickMyNewSearch();
		user.atSearchPage.clickOnTapToSaveChanges();
		user.atSearchPage.setSearchName();
		user.atSearchPage.clickOnSaveButton();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnLoadSavedSearchButton();
		user.atSearchPage.clickOnThirdSearchInList();
		user.atPerchwellPage.clickOnMyNewSearch();
		user.atSearchPage.clickOnLoadSavedSearchButton();
		user.atSearchPage.shouldSeePreviouslyCreatedSearch();
		user.atSearchPage.clickOnPreviouslyCreatedSearch();
		user.atPerchwellPage.clickOnList();
		user.atPerchwellPage.shouldFilter1Bed1AndHalfBathBeApplied();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.shouldFilterFireplaceApplied();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.openSecondBuilding();
		user.atOpenedBuildingPage.shouldFilterFireplaceApplied();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.openThirdBuilding();
		user.atOpenedBuildingPage.shouldFilterFireplaceApplied();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.clickOnMap();
		user.atMapPage.checkForChangesAfterApplyingTheFilter();
		user.atPerchwellPage.clickOnAnalytics();
		user.atAcrisClosingPage.isBuildingTypeByDealCountChartDisplayed();
		user.atRebnyListingsPage.shouldSeeBedroomCountChart();
		user.atManagementPage.shouldSeeDaysOnMarketChartWithSwipe();
		user.atNycTownhousesPage.isGardenChartDisplayed();
		user.atAcrisClosingPage.shouldSeeBuildingHeightChartWithSwipe();
		user.atRebnyListingsPage.shouldSeeAskingPriceChartWithSwipe();
		user.atAnalyticsPage.clickOnMagnifierIconWithPreviouslySavedSearch();
		user.atSearchPage.shouldFireplaceFilterBeApplied();
		user.atSearchPage.should1AndHalfBathFilterBeApplied();
		user.atSearchPage.should1BedFilterBeApplied();
	}
}
