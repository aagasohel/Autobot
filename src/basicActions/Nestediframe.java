package basicActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement singlefrm =driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		if(singlefrm.isDisplayed()) {
			System.out.println("single iframe button is visible");
		}else {
			System.out.println("single iframe button is not visible");
		}
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html' and @id='singleframe']"));
		driver.switchTo().frame(iframe1);
		WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox1.sendKeys("sohel");
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		WebElement nestfrm = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		nestfrm.click();
		
		WebElement nestifrm = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(nestifrm);
		WebElement ifrmdemo =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html' and @style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(ifrmdemo);
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox2.sendKeys("automation");
		
		driver.switchTo().defaultContent();
	}

}
