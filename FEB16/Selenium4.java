package FEB16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Selenium4 {

	public static void main(String[] args) {
	
		
// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
	//WebElement dd=driver.findElement(By.name("selct-demo"));
	
	//Select obj=new Select(dd);
	 //obj.selectByValue("monday");
	
	Select multiDD=new Select(driver.findElement(By.name("Multi Select List Demo")));
	multiDD.selectByIndex(1);
	multiDD.selectByValue("New York");
	multiDD.selectByVisibleText("Washington");
	multiDD.deselectAll();
	//Thread.sleep(3000);
	driver.close();
	}
}

		


	


