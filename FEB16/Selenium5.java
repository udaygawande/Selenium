package FEB16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
		WebElement dd=driver.findElement(By.name("Select List Demo"));
		WebElement dd1=driver.findElement(By.name("select demo"));
		

		//Select obj=new Select(dd1);
		selectByValue("monday");
		
	//	after friday
		WebElement muldii=driver.findElement(By.name("Select-Demo"));

Select  multiDD=new Select(driver.findElement(By.name("State")));


multiDD.selectByIndex(1);

}

	private static void selectByValue(String string) {
		// TODO Auto-generated method stub
		
	}
}