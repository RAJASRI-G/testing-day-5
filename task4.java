package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	public static void main(String args[])
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	driver.get("https://www.abhibus.com/bus-ticket-booking");
	WebElement depart=driver.findElement(By.name("source"));
	depart.sendKeys("Coimbatore",Keys.ENTER);
	WebElement depart1=driver.findElement(By.name("destination"));
	depart1.sendKeys("Japan",Keys.ENTER);
	WebElement datepicker=driver.findElement(By.id("datepicker1"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','14/09/2023')",datepicker);
}
}
