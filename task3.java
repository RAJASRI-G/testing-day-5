package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement custid=driver.findElement(By.name("cusid"));
    	custid.sendKeys("123");
    	WebElement choice=driver.findElement(By.name("submit"));
    	choice.submit();
    	Alert alert1=driver.switchTo().alert();
    	//Thread.sleep(3000);
    	alert1.dismiss();
    	custid.clear();
    	custid.sendKeys("496");
    	choice.click();
    	Alert  alert2=driver.switchTo().alert();
    	alert2.accept();
    	Alert alert3=driver.switchTo().alert();
    	String m=alert3.getText();
    	alert3.accept();
    	System.out.print(m);
	}

}
