package ProfileCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResidentialCustomer {

	public static void main(String[] args) {
		System.out.println("My First Java Class\n");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.consumersenergy.com/");
			
			driver.close();
	}
}