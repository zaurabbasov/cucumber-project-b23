package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkVisibilityOfElement(By locator, int timeToWait){

        boolean result = false;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeToWait);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated( locator )    );
            result= true;
        }catch (TimeoutException e){
            // System.out.println("The error message is = " + e.getMessage());
            System.out.println("WE DID NOT SEE THE ERROR MESSAGE ELEMENT");
        }
        return result;


    }
}
