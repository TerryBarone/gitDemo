import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Implicit wait - choose max amount of time to wait selenium waits for an element to be displayed
		//We are going to set an implicit wait on the driver to wait up to 5 seconds to find an element
		
		//Invoke chrome browser
		WebDriver driver = new ChromeDriver();
		//Assign the kind of wait on the driver using manage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//go to a specified url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//find element by ID - we are finding the input for username and typing Terry in the input
		driver.findElement(By.id("inputUsername")).sendKeys("Terry");
		//find element by Name - we are finding the input for password and typing an incorrect pass in the input
		driver.findElement(By.name("inputPassword")).sendKeys("WrongPassword");
		//find element by ClassName - we are finding the sign in button using classname and clicking button
		driver.findElement(By.className("signInBtn")).click();
		//find element by cssSelector and get text
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//find element by link path - allows selenium to select a link depending on the link's text
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//There is an animation effect that will cause an issue when you are clicking reset password button
		//Using Thread.sleep(miliSeconds) java tool - you can tell the program to stop here for x amount of time
		Thread.sleep(2000); //2000ms=2s so the program will wait for 2 seconds before continueing 
		
		//Find element by xpath - selecting username using xpath and sending keys
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Terry");
		//find element with cssSelector and tag name attribute as a selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("baroterrence@gmail.com");
		//clear email by using common attribute array
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//refill out email using correct email using unique tag attribute 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("barone.terrence@gmail.com");
		//Fill out phone number using parent/child selectors for xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9085917593");
		//use cssSelector with class to reset pass
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//get password reset confirmation text using tag and class
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
		
		
		
		
		driver.close();

	}

}
