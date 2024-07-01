package basicActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement label = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String data = label.getText();
		System.out.println(data);
		
		WebElement crtnewacctbtn = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		crtnewacctbtn.click();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement fname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		//WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("sohel");

	}

}
