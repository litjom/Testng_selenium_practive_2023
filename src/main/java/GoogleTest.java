import org.apache.logging.log4j.core.net.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {


  public  WebDriver driver;

@BeforeMethod
    public void setup(){
   // System.setProperty("webdriver.chrome.driver","");


System.setProperty("webdriver.chrome.driver","C://Users//litti//OneDrive//Desktop//Selenium//Selenium_Exe//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    this.driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://www.google.com/");
}

@Test (priority=1,groups="Regression")
public void TitleTeat(){

   String title = driver.getTitle();
   System.out.println(title);
}

@Test
public void Googlelogotest() throws InterruptedException {
    Thread.sleep(3000);
    boolean b =driver.findElement(By.xpath("//textarea[@id='APjFqb']")).isDisplayed();
}

    @Test (priority=2)
    public void Googlebartest() throws InterruptedException {
        Thread.sleep(3000);
      driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("FIFA");
      driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
    }

    @Test (priority=3,groups="Regression")
    public void TitleTeat21(){

        String title = driver.getTitle();
        System.out.println(title);
    }

@AfterMethod
    public void teardown(){
    driver.quit();
    driver.close();

}



}
