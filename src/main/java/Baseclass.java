import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

import java.io.File;
import java.io.IOException;

public abstract class Baseclass {


    public static WebDriver driver;

    public void intialization(){
        System.setProperty("webdriver.chrome.driver","C://Users//litti//OneDrive//Desktop//Selenium//Selenium_Exe//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http.//www.google.com");

    }
    public void failed() throws IOException {
       File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile,new File("C://Users//litti//IdeaProjects//Testng_Selenium_Project//src//main//Screenshot//testFailure.jpeg"));   //Taking scrrenshot where you have to pass source and destination file
    }

    public abstract void onTestFailure(ITestListener result) throws IOException;
}
