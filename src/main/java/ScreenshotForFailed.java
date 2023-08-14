import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;


@Listeners(CustomListner.class)
public class ScreenshotForFailed extends Baseclass {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
intialization();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
        driver.close();
    }

    @Test
    public void TakeScreenshot(){
        Assert.assertEquals("false","true");
    }


    @Override
    public void onTestFailure(ITestListener result) throws IOException {
        System.out.println("Base class failure");
        failed();
    }
}
