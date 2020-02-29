package FEB16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SElenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\eclipse_64bit\\JAVASCRIPT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?pws=0&sxsrf=ALeKk02wYxRoq91azbruiy1WaJHx6UJp1A%3A1582388611177&ei=g1VRXoTBCv2f4-EPgfWUsA0&q=fb&oq=fb&gs_l=psy-ab.3..0i131i67j0i67j0i131j0j0i131j0j0i131j0j0i131j0.3153.4097..4941...0.2..0.560.1182.3-2j0j1......0....1..gws-wiz.......0i71j35i39.40mACZPMhtY&ved=0ahUKEwjEjsP4yOXnAhX9zzgGHYE6BdYQ4dUDCAs&uact=5");
		driver.get("https://www.facebook.com/");
	}

}
