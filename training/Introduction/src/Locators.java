import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "c:/Users/edwardv/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys("a@bcd.com");
        driver.findElement(By.name("inputPassword")).sendKeys("123456");
        driver.findElement(By.className("submit")).click();

    }
}
