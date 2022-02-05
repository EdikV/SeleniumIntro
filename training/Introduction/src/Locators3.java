import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;


public class Locators3 {
    public static void main(String[] args) throws InterruptedException {
        //String Uname="a@bcd.com";
        System.setProperty("webdriver.chrome.driver", "c:/Users/edwardv/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Siblings - parent traverse
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
        driver.close();

        }
}