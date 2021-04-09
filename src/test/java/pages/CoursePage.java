package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage extends BasePage {
    @FindBy(css = ".course-header2__title")
    private WebElement title;

    @FindBy(css = "div.course-header2__new span.course-header2__button__text")
    private WebElement signUpButton;

    public CoursePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitleText() {
        return title.getText();
    }

    public String getButtonText() {
        return signUpButton.getText();
    }
}
