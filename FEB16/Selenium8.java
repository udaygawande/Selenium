package FEB16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form/");
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("uday");
driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("i know");
//driver.findElement(By.xpath("//input[@id='buttonwithclass'][@name='btnsubmit']"));
driver.findElement(By.xpath("//input[@value='Male']")).click();
driver.findElement(By.xpath("//input[@value='2']")).click();
driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/7/1998");
driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
	
	
	}

}
