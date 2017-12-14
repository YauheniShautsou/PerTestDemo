package com.perchwell.steps;


import com.perchwell.entity.Account;
import com.perchwell.pages.starting.LoginPage;
import com.perchwell.pages.starting.WelcomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.yecht.Data;


public class LoginSteps extends ScenarioSteps {

    Account account;
    WelcomePage welcomePage;
    LoginPage loginPage;


    private void login(String email, String password) {

        welcomePage.clickLoginButton();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Step ("Log in as Client ")
    public void loginAsClient(){
      login(account.client_email, account.client_password);

    }

    @Step ("Log in as Broker ")
    public void loginAsBroker(){
        login(account.email, account.password);

    }

}
