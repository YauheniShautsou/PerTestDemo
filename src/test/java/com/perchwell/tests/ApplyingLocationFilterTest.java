package com.perchwell.tests;

import org.junit.Ignore;
import org.junit.Test;

public class ApplyingLocationFilterTest extends SampleTest {



	@Test
public void resultAfterApplyingLocationFilter() {
	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.countItemsInListViewBeforApplyingFilter();
    perchwellSteps.clickMagnifer();
   // searchSteps.clickDeleteFirstLocation();
	searchSteps.clickDeleteSecondLocation();
	searchSteps.clickApplyButton();
	perchPopupSteps.clickNotNowButton();
	//perchwellSteps.shoudSeeNoLessItemsInListViewAfterDeleteFilter();
	perchwellSteps.clickMap();
	mapSteps.ckickNotNowButton();
		mapSteps.zoomIn();
		mapSteps.zoomIn();
	mapSteps.countItemsInListView();
	mapSteps.countItemsInListAndMapViewIsSame();

}
}