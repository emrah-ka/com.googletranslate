package com.googletranslate.utility;

import com.googletranslate.pages.GoogleTranslatePage;

public class Pages {
    private GoogleTranslatePage googleTranslatePage;
    private Driver driver;

    public GoogleTranslatePage googleTranslatePage(){
        if(googleTranslatePage==null){
            googleTranslatePage=new GoogleTranslatePage();
        }
        return googleTranslatePage;
    }




}
