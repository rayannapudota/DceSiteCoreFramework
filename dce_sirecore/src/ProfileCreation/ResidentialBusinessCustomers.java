package ProfileCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResidentialBusinessCustomers {

	public static void main(String[] args) {
		System.out.println("Starting ResidentialBusinessCustomers Class\n");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.consumersenergy.com/");
			driver.close();
			System.out.println("Ending ResidentialBusinessCustomers Class\n");
	}
}