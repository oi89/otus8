package utils;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.util.Optional;

public class MyTestWatcher implements TestWatcher {
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.addAttachment("MyTestWatcher", new ByteArrayInputStream(
                ((TakesScreenshot) Driver.getChromeDriver()).getScreenshotAs(OutputType.BYTES)));

        Driver.closeDriver();
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Allure.addAttachment("MyTestWatcher", new ByteArrayInputStream(
                ((TakesScreenshot) Driver.getChromeDriver()).getScreenshotAs(OutputType.BYTES)));

        Driver.closeDriver();
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Driver.closeDriver();
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Driver.closeDriver();
    }
}
