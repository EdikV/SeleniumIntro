import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String Uname="a@bcd.com";
        System.setProperty("webdriver.chrome.driver", "c:/Users/edwardv/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String Pwd= getpwd(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(Uname);
        driver.findElement(By.name("inputPassword")).sendKeys(Pwd);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        //System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " +Uname +",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(1000);
        //driver.close();


    }
    public static String getpwd(WebDriver driver) throws InterruptedException //in order to use driver in new code, we need to send it as an input from previous block
    {
        //here we extracted the password from the from and splitted it into sections, we also declared the method as a static method
        //that returns values, the password.
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String pwdtxt=(driver.findElement(By.cssSelector("form p")).getText());
        String [] s_pwd= pwdtxt.split("'");
        String password =s_pwd[1].split("'")[0];
        return password;


    }

}
