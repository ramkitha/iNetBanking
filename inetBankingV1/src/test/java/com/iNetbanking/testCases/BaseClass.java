package com.iNetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.iNetbanking.utilities.Readconfig;

public class BaseClass {

	Readconfig readconfig = new Readconfig();
	public String baseURL = readconfig.getapplicationURL();
	// public String baseURL = "http://demo.guru99.com/V1/index.php";
	public String userName = readconfig.getUsername();
	public String password = readconfig.getPassword();
	// public String userName ="mngr314738";
	// public String password = "jAgUtYb";

	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logger = Logger.getLogger("inetBanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
		}
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
