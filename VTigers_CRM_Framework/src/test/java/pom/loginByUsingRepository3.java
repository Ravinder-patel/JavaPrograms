package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.ObjectRepository.loginPage;
import com.comcast.generic.file.utility.PropertiesFileUtility;

public class loginByUsingRepository3 {
	public static void main(String[] args) throws Throwable {

		// get common data from properties file utilitty
		PropertiesFileUtility pFileUtil = new PropertiesFileUtility();

		String BROWSER = pFileUtil.getDataFromProperties("browser");
		String URL = pFileUtil.getDataFromProperties("url");
		String USERNAME = pFileUtil.getDataFromProperties("username");
		String PASSWORD = pFileUtil.getDataFromProperties("password");

		WebDriver driver = null;

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();

		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver(); // default browser
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to application
		driver.get(URL);

		// Objects ulitilaztiom fromm pom create object for pom repository
		loginPage pf = PageFactory.initElements(driver, loginPage.class);

		// calling Business Function in (loginpage) pom
		pf.logIntoVtigers(USERNAME, PASSWORD);

		Thread.sleep(3000);
		driver.quit();

	}

}
