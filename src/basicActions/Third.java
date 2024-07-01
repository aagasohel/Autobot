package basicActions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Third {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		Dimension d = driver.manage().window().getSize();
		System.out.println("Default dimension= "+d);
		
		Thread.sleep(1000);
		Dimension mysize = new Dimension(700, 300);
		driver.manage().window().setSize(mysize);
		
		Point p = driver.manage().window().getPosition();
		System.out.println("Default Position = "+p);
		
		Thread.sleep(1000);
		Point pos = new Point(500,250);
		driver.manage().window().setPosition(pos);
		
		driver.close();

	}

}
