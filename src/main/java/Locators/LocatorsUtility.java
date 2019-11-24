package Locators;

import org.openqa.selenium.By;

public class LocatorsUtility {
    /**
     * @param locator
     * @return
     */
    public static By getBy(String locator) {
        By temp = null;
        String value = null;

        if(locator.indexOf("=") > 0) {
            String[] arrOfStr = locator.split("=", 2);
            locator = arrOfStr[0];
            value = arrOfStr[1];
            if ("xpath".equals(locator)) {
                temp = By.xpath(value);
            } else if ("className".equals(locator)) {
                temp = By.className(value);
            } else if ("id".equals(locator)) {
                temp = By.id(value);
            } else if ("name".equals(locator)) {
                temp = By.name(value);
            } else if ("link".equals(locator)) {
                temp = By.linkText(value);
            } else if ("tagname".equals(locator)) {
                temp = By.tagName(value);
            } else if ("partiallink".equals(locator)) {
                temp = By.partialLinkText(value);
            } else if ("css".equals(locator)) {
                temp = By.cssSelector(value);
            }
        }

        return temp;
    }

}
