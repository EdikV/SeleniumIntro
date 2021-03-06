import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction {
//WebDriver is an interface
//Selintroduction is a class that inherited the WebDriver methods.
//to use class selintroduction, it needs to inherit the webdriver methods.
	

	public static void main(String[] args) {
		//Invoking the browser
		//To use chrome - ChromeDriver is needed -> Methods are actions you perform
		//first we need to create an object named driver to access the methods of class
		//ChromeDriver = WebDriver methods+ internal call methods
		//ChromeDriver driver = new ChromeDriver(); //Object driver inherits chromedriver methods
		//ChromeDriver.exe -> Chrome Browser driver that will allow selenium to access the chrome browser.
		//System.setProperty("webdriver.chrome.driver", "c:/Users/edwardv/selenium/");
		//====================================Headless Params=============================================
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
		//WebDriver driver = new ChromeDriver(options);
		//================================================================================================
		//Chrome Launch
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.w3schools.com/java/java_interface.asp"); //opens chrome and navigates to a url
		//System.out.print(driver.getTitle()); //gets the title of the webpage and prints it out
		//System.out.print(driver.getCurrentUrl());
		//driver.quit();//closes all open sessions that originated in the automated chrome.
		//driver.close(); only closes the current open window and leaved the rest of the tabs/windows open.
		//driver object 
		//================================================================================================
		//Firefox Launch
		//Firefox- FirefoxDriver ->methods, these methods are common across all browsers in selenium
		//the basis of every driver is called WebDriver, and on-top of that additional class methods were 
		//created
		System.setProperty("webdriver.gecko.driver", "c:/Users/edwardv/selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/java/java_interface.asp"); //opens chrome and navigates to a url
		System.out.print(driver.getTitle(  )); //gets the title of the webpage and prints it out
		System.out.print(driver.getCurrentUrl());
		driver.quit();
		//================================================================================================
		

	}

}
