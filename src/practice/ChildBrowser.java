package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChildBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement tryitbtn = driver.findElement(By.xpath("(//a[@class='w3-button ga-fp tryit-button' and text()='Try it Yourself'])[1]"));
		tryitbtn.click();
		
		Set<String> alladdresses =driver.getWindowHandles();
		Iterator<String> it =alladdresses.iterator();
		
		while(it.hasNext())
		{
			String address = it.next();
			driver.switchTo().window(address);
			String currenttitle =driver.getTitle();
			if(currenttitle.equals("W3Schools Tryit Editor"))
			{
				WebElement iframe =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframe);
				WebElement text =driver.findElement(By.xpath("//h1"));
				System.out.println(text.getText());
			}
		}
		

	}

}
