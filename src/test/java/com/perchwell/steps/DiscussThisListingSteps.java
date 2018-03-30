package com.perchwell.steps;

import com.perchwell.pages.perchwell.DiscussThisListingPage;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiscussThisListingSteps extends ScenarioSteps {

    DiscussThisListingPage discussThisListingPage;
    OpenedBuildingPage openedBuildingPage;

    @Step
    public void deleteDiscussionWithClientIfExist() throws Exception {
        if (openedBuildingPage.isClientWithDiscussionExist()) {
            openedBuildingPage.clickViewAllDiscussionsButton();
            discussThisListingPage.DeleteClientsWithDiscussion();
            discussThisListingPage.clickClosePageButton();
            openedBuildingPage.clickShareButton();
            openedBuildingPage.clickSendWithinPerchwell();
        }
    }
}
