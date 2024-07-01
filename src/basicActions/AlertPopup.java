package basicActions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Options opt =driver.manage();
		Timeouts tout= opt.timeouts();
		tout.implicitlyWait(Duration.ofMillis(10000));
		
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryitbtn.click();
		
		Alert alt = driver.switchTo().alert();
//		TargetLocator tl =driver.switchTo();
//		Alert alt = tl.alert();
		String alerttext = alt.getText();
		System.out.println(alerttext);
		alt.accept();
		

	}

}
