package com.googletranslate.pages;

import com.googletranslate.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleTranslatePage {

    public GoogleTranslatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void getPage(){
        Driver.getDriver().get("https://translate.google.com/");
    }

    @FindBy(id = "source")
    public WebElement sourceTextField;

    @FindBy(className = "tlid-results-container results-container empty")
    public WebElement resultTextField;

    @FindBy(className = "sl-more tlid-open-source-language-list")
    public WebElement sourceLangSelect;

    @FindBy(className = "tl-more tlid-open-target-language-list")
    public WebElement targetLangSelect;

    @FindBy(className = "tlid-translation translation")
    public WebElement resultText;



}
