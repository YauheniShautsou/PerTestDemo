package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class TC26_DiscussionWithExistingAgent extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void discussionWithExistingAgent() throws Exception {
		loginSteps.loginAsClient();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickDiscussWithMyAgentButton();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingAgent();
		discussionSteps.sendMessage("I'd like discuss with you " + sdf);
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDuscussionWithAgent();
		openedBuildingSteps.openExistingDuscussionWithAgent();
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}