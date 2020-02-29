package FEB16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/maven-tutorials");
	driver.get("https://www.seleniumeasy.com/comment/reply/283#comment-form-demo.html");
	WebElement textbox=driver.findElement(By.name("First_names"));
	
	
	
	textbox.sendKeys("Uday");
	WebElement textbox1=driver.findElement(By.name("last_Name"));
textbox.sendKeys("Gawande");
	}

}
