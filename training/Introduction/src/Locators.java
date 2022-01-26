import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:/Users/edwardv/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("a@bcd.com");
        driver.findElement(By.name("inputPassword")).sendKeys("123456");
        driver.findElement(By.className("signInBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Edward");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("1@abc.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Edward");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //Regular expression



        //================================================================//
        //driver.findElement(By.className("btn-mute")).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.name("facebook")).click();

    }
}
