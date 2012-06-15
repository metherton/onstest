package com.ethertons.pages;

import java.util.List;

import com.ethertons.constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TreeListPage {

    private static final String TREE_LIST_URL = Urls.HOST + "/trees";
    private final WebDriver driver;

    public TreeListPage(WebDriver driver) {
        this.driver = driver;
    }

    public TreeListPage load() {
        driver.get(TREE_LIST_URL);
        return this;
    }

    public boolean hasTrees() {
        List<WebElement> trees = driver.findElements(By.id("tree"));
        if (((trees.size() > 0) ? true : false)) return true;
        else return false;
    }
}
