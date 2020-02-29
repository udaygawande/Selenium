package FEB16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class Selenium6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
	System.out.println(alllinks);
		for(WebElement link:alllinks)
		{
			System.out.println(link.getText()+"-->"+link.getAttribute("href"));
		
		}
	}

}
