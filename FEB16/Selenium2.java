package FEB16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//driver.getCurrentUrl();
	driver.findElement(By.name("uday")).sendKeys("Patil");
	WebElement list=driver.findElement(By.name("Sex"));
	//List<WebElement> list=driver.findElement(By.name("sex"));
	
	}

}
