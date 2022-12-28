import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTechniques {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise");
		
		//DROP DOWN WITH SELECT TAG
		//Selenium has a class Select that expects a variable which is the web element of that dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		//select dropdown item by index
		dropdown.selectByIndex(3);
		//select dropdown item by web element and get text
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//Select by visible text
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//Select by value
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Opening drop down and clicking more passenger 
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i = 0; i < 4 ; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
