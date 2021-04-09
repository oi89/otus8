package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.MyTestWatcher;

@ExtendWith(MyTestWatcher.class)
public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = Driver.getChromeDriver();
    }
}
