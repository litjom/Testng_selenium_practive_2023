import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Parameter_TestPackage {

WebDriver driver;
    @Test
    @Parameters({"browser","email","pass"})
    public void setup(String browser,String email,String pass){
        // System.setProperty("webdriver.chrome.driver","");
if(browser.equals("chrome")) {

    System.setProperty("webdriver.chrome.driver", "C://Users//litti//OneDrive//Desktop//Selenium//Selenium_Exe//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    this.driver = new ChromeDriver();
}
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(email);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys(pass);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
    }

    @Test
    public void paramter(){
System.out.println("Hello parameter");
    }
}
