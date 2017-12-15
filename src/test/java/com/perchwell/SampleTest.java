package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SampleTest {

    @Managed
    WebDriver driver;

    @Steps
    OpenedBuildingSteps openedBuildingSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ClientSteps clientSteps;

    @Steps
    TagsSteps tagsSteps;

    @Steps
    PerchwellSteps perchwellSteps;

    @Steps
    PerchPopupSteps perchPopupSteps;

    @Steps
    AccountSteps accountSteps;

       //id=1
    @Ignore
    @Test
    public void LogInAsClient() throws Exception {

        loginSteps.loginAsClient();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.shouldSeeOptionAgents();
        accountSteps.shouldSeeOptionDisscussions();
        accountSteps.shouldSeeOptionTags();
        accountSteps.shouldSeeOptionCompare();
    }

//id=2
@Ignore
    @Test
    public void LogInAsBroker() throws Exception {

        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.shouldSeeOptionClient();
        accountSteps.shouldSeeOptionDisscussions();
        accountSteps.shouldSeeOptionTags();
        accountSteps.shouldSeeOptionCompare();
    }

//id=3
    @Test
    public void LogInWithGoogle() throws Exception {
        loginSteps.loginWithGoogle();
        perchPopupSteps.shouldSeePopupText();
    }

    @Ignore
    //id=5
    @Test
    public void addClient() throws Exception {

        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickClientsLabel();
        clientSteps.clickAddNewClientButton();
        clientSteps.setRundomClientData();
        clientSteps.clickGroupLabel();
        clientSteps.selectGroup("Actively Searching");
        clientSteps.clickInviteButton();
        clientSteps.shouldSeeRecentlyCreatedClient();

    }

    //id=6
      @Test
    public void useExistingTagForListing() throws Exception {

        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickMyTagsLabel();
        tagsSteps.clickExistingTagLabel();
        tagsSteps.clickBackButton();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickTagsLabel();
        tagsSteps.shouldSeeExistingTagUpperCase();
        tagsSteps.clickUsedTag();
        tagsSteps.clickSearchButton();
        tagsSteps.shouldSeeExistingTagUpperCase();
    }


    //id=7
    @Ignore
    @Test
    public void createNewTagForListing() throws Exception {

        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickMyTagsLabel();
        tagsSteps.setRandomTagAndSave();
        tagsSteps.clickBackButton();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickTagsLabel();
        tagsSteps.shouldSeeCreatedTagUpperCase();
        tagsSteps.clickCreatedTag();
        tagsSteps.clickSearchButton();
        tagsSteps.shouldSeeCreatedTagUpperCase();
    }


    //id=9
@Ignore
    @Test
    public void deleteCreatedTag() throws Exception {

        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickMyTagsLabel();
        tagsSteps.setRandomTagAndSave();
        tagsSteps.clickBackButton();
        openedBuildingSteps.ckickDeleteTagButton();
        tagsSteps.shouldNotSeeCreatedTagUpperCase();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickTagsLabel();
        tagsSteps.shouldNotSeeCreatedTagUpperCase();
    }


    @Ignore
    //id=10
    @Test
    public void addToCompare() throws Exception {

        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.addToCompare();
        perchwellSteps.openSecondBuilding();
        openedBuildingSteps.addToCompare();
        perchwellSteps.openThirdBuilding();
        openedBuildingSteps.addToCompare();

        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickClientsLabel();
        clientSteps.clickAddNewClientButton();
        clientSteps.setRundomClientData();
        clientSteps.clickGroupLabel();
        clientSteps.selectGroup("Actively Searching");
        clientSteps.clickInviteButton();
        clientSteps.shouldSeeRecentlyCreatedClient();

    }


}