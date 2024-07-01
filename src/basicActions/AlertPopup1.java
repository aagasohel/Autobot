package basicActions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryitbtn.click();
		
		Alert alt = driver.switchTo().alert();
		String alerttext = alt.getText();
		System.out.println(alerttext);
		alt.sendKeys("Automation");
		Thread.sleep(10);
		alt.accept();
		
		WebElement status = driver.findElement(By.xpath("//p[text()='Hello Automation! How are you today?']"));
		if(status.isDisplayed()) {
			System.out.println("status is displaying");
		}
		else {
			System.out.println("status is not displaying");
		}
		
	}

}
