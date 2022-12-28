import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking Browser
		// Chrome - Chrome Driver -> Methods
		//driver will have all WebDriver methods + their own class methods
		//System.setProperty("webdriver.chrome.driver", "/Users/terrybarone/Desktop/WebDriver/chromedriver");
		//chromedriver.exe will invoke chrome browser.
		//webdriver.chrome.driver - this key value we have to get the value of the path where the chrome driver is located W
		WebDriver driver = new ChromeDriver();
		//How to go to a specific URL
		driver.get("https://www.google.com/?client=safari");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//The following will close the tab
		driver.close();
		//The following will close the browser
		//driver.quit();

	}

}
