package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultPage {

    @FindBy(id="result-stats")
    private WebElement searchResultCount ;

    @FindBy(xpath="//h3[@class='LC20lb DKV0Md']")
    private List<WebElement> resultlinks;

    public GoogleResultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getResultCountText(){
        return searchResultCount.getText();
    }

    public void printAllSerachResultLinks(){

        System.out.println("resultlinks.size() = " + resultlinks.size());

        for (WebElement eachLinkElm : resultlinks) {
            if(eachLinkElm.getText().isEmpty()) {
                continue;
            } System.out.println("eachLinkElm.getText() = " + eachLinkElm.getText());
        }
    }


}
