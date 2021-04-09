package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    protected WebDriver driver;
    protected Logger logger;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        logger = LogManager.getLogger(MainPage.class);
        actions = new Actions(driver);
    }

    public WebElement getWebElementByName(String locator, String elementName) {
        String updatedLocator = String.format(locator, elementName);
        WebElement element = driver.findElement(By.xpath(updatedLocator));
        return element;
    }
}
