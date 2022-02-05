import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.*;

public class Browser_Activities {
    public static void main(String [] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "c:/Users/edwardv/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //opens chrome in maximized mode
        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        //driver.close();



    }
}
