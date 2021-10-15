package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(id="user_count")
    private WebElement userCountElm ;

    @FindBy (id="book_count")
    private WebElement bookCountElm ;

    @FindBy (id="borrowed_books")
    private WebElement borrowedrCountElm ;

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public String getUserCountText(){
        return userCountElm.getText();
    }

    public String getBookCountText(){
        return userCountElm.getText();
    }

    public String getBorrowedBookCountText(){
        return userCountElm.getText();
    }


}
