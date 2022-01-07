package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver drive=new ChromeDriver();
	drive.get("http://leafground.com/pages/Dropdown.html");
	drive.manage().window().maximize();
	
	WebElement drop1=drive.findElement(By.id("dropdown1"));
	Select dropdown=new Select(drop1);
	dropdown.selectByIndex(1);
	
	WebElement drop2=drive.findElement(By.name("dropdown2"));
	Select dropdown11=new Select(drop2);
	dropdown11.selectByVisibleText("Appium");
	
	WebElement drop21=drive.findElement(By.name("dropdown3"));
	Select dropdown13=new Select(drop21);
	dropdown13.selectByValue("3");
	
	

	
}
}