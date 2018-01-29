package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TC22_DiscussionWithNewClientTest extends SampleTest {

	@Test
	public void discussionWithNewClientTest() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickDiscussWithMyClientButton();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickAddNewClientButton();
		clientSteps.setRundomClientData();
		clientSteps.clickGroupLabel();
		clientSteps.selectGroup("Actively Searching");
		clientSteps.clickInviteButton();
		discussionSteps.clickBackButton();
		clientSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.shouldSeeRecentlyCreatedClient();
		clientSteps.clickDesiredClient();
		discussionSteps.shouldSeeDicsussionWithNewClient();


		}
}
