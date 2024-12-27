import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/thanhtran/Downloads/chromedriver-mac-arm64 2/chromedriver");

        WebDriver  driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println("edit from MAC Air");
        driver.quit();
    }
}
