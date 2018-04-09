package com.perchwell.steps;

import com.perchwell.email.NewInstanceDriverForResetPassword;
import com.perchwell.entity.AppProperties;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.starting.LoginPage;
import com.perchwell.pages.starting.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.net.MalformedURLException;


public class ResetPasswordSteps extends ScenarioSteps {

    LoginPage loginPage;
    WelcomePage welcomePage;

    @Step
    public void setRestEmail(String email){
        loginPage.setRestEmail(email);
    }

    @Step
    public void resetPasswordButtonClick(){
        loginPage.resetPasswordButtonClick();
    }

    @Step
    public void shouldFindSentEmail(){
        Assert.assertTrue(loginPage.shouldFindSentEmail(AppProperties.INSTANCE.getProperty("reset_email")));
    }

    @Step
    public void getResetToken(){
        loginPage.getResetToken(loginPage.getValueFromSessionVariable("emailText"));
    }

    @Step
    public void setNewPassword() throws InterruptedException {
        NewInstanceDriverForResetPassword.resetPasswordInSafari(loginPage.generateNewPassword());
    }

    @Step
    public void backButtonClick(){
        loginPage.backButtonClick();
    }

    @Step
    public void isAccountNeededToSignInMessageDisplayed(){
        Assert.assertTrue(loginPage.isAccountNeededToSignInMessageDisplayed());
    }

    @Step
    public void okButtonClick(){
        loginPage.okButtonCLick();
    }

    @Step
    public void clickForgotPassword() { welcomePage.clickForgotPassword(); }

    @Step
    public void login (String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Step
    public void overwritingOldPassword(){
        AppProperties.INSTANCE.setProperty("old_reset_password",AppProperties.INSTANCE.getProperty("new_reset_password"));
    }
}