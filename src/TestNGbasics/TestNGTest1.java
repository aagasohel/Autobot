package TestNGbasics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest1 {
	WebDriver driver;
	@BeforeTest
	@Parameters("Browser")
	void setup(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\shoel\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			}
	else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shoel\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		}
	}
	@BeforeClass
	@Parameters("url")
	void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority= 2, dependsOnMethods = "urlTest")
	void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
		if(logo.isDisplayed()) {
			System.out.println("logo is present on the homepage hence test is pass");
		}
		else {
			System.out.println("logo is not present on the homepage hence test is failed");
		}
	}
	@Test(priority= 1)
	@Parameters("url")
	void urlTest(String url) {
		String url1 = driver.getCurrentUrl();
		if(url1.equalsIgnoreCase(url)) {
			System.out.println("url is matching hence url test is pass");
		}
		else {
			System.out.println("url is not matching hence url test is failed");
		}	
	}
	@Test(priority =3)
	void firstTryItUrself() {
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String childwin :allwin) {
			if(!childwin.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(childwin);
				WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframe);
				WebElement text = driver.findElement(By.xpath("//h1"));
				System.out.println(text.getText());
				driver.close();
				driver.switchTo().window(parentwin);
			}
		}
	}
	@Test(priority = 4)
	void secondTryItUrself() {
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[2]")).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String childwin :allwin) {
			if(!childwin.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(childwin);
				WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframe);
				WebElement text = driver.findElement(By.xpath("//h1"));
				System.out.println(text.getText());
				driver.close();
				driver.switchTo().window(parentwin);
			}
			}
	
	}
	@AfterClass
	void closeBrowser() {
		driver.quit();
	}

}
