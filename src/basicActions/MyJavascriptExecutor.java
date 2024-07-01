package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		 
		//js.executeScript("windows.scrollBy(0,400);");
		WebElement Countrybox = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		js.executeScript("arguments[0].scrollIntoView(true)",Countrybox);
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(Countrybox).click().build().perform();
		WebElement cntryname =driver.findElement(By.xpath("//li[text()='Bangladesh']"));
		act.moveToElement(cntryname).click().build().perform();
		

	}

}
