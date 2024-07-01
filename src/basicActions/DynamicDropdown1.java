package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DynamicDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(1000);
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		
		
		Thread.sleep(1000);
		WebElement tshirts = driver.findElement(By.xpath("//a[@data-reactid='31' and text()='T-Shirts']"));
		act.moveToElement(tshirts).click().build().perform();
		

	}

}
