package test_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.testng.AssertJUnit.assertEquals;

public class AutomationTestNg {
    String driverPath = "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
    WebDriver driver = new ChromeDriver();
    String ServerUrl =  "https://www.alarm.test-us.adcinternal.com/login.aspx";
    String _UserName = "fullLocator";
    String _Password = "Test12345!";
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        System.setProperty("webDriver.chrome.driver",driverPath);
        driver.manage().window().maximize();
        driver.get(ServerUrl);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_loginform_txtUserName")).sendKeys(_UserName);
        driver.findElement(By.name("txtPassword")).sendKeys(_Password);
        driver.findElement(By.id("signInButton")).click();
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl= "https://www.alarm.test-us.adcinternal.com/web/system/home";
        assertEquals(currentUrl,expectedUrl);
        System.out.println("Login successfully");
    }
    @Test
    // Navigate to notifications page
    public void NaviagteMenuBar() throws InterruptedException {
        System.setProperty("webDriver.chrome.driver",driverPath);
        driver.findElement(By.xpath("//ul[@class='collection']//child::li[@route-id='notifications']")).click();
        String expectedTitle = "https://www.alarm.test-us.adcinternal.com/web/Notifications/NotificationsNew.aspx";
        Thread.sleep(2000);
        String actualTile = driver.getCurrentUrl();
        assertEquals(actualTile,expectedTitle);
        System.out.println("User in notifications tab");
    }
    @Test
    // Navigate to user page
    public void User(){
        System.setProperty("webDriver.chrome.driver",driverPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500000));
        driver.findElement(By.xpath("//ul[@class='collection']//child::li[@route-id='users']")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println("User in users tab");
    }
}
