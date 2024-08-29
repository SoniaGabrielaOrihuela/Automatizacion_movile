package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchScreen;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen buscarpantalla;
    //SearchDetailsScreen searchDetailsScreen;

    public void clickClose() {
        loginScreen.clickClose();
    }

    public MobileElement findElement(By id) {
        return null;
    }

    public String getResultText() {

        return buscarpantalla.getResultText();
    }

}
