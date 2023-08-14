import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


public class DataProvideOrange {
    WebDriver driver;
    @Test(dataProvider = "getTestDAte")

    public void setup23(String username,String password){
        // System.setProperty("webdriver.chrome.driver","");


            System.setProperty("webdriver.chrome.driver", "C://Users//litti//OneDrive//Desktop//Selenium//Selenium_Exe//chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            this.driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
    }

    @Test
    public void loginpage(){
        System.out.println("hello How ar eyou");
    }

 /*   @DataProvider
    public Iterator<Object[]> getTestDAte(){
       ArrayList<Object[]> testdata = ExcelIntegration.getcelldata();
       return testdata.iterator();//Each and every element in proper in sequence

    }
*/

}
