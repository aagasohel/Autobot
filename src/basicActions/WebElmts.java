package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebElmts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement label = driver.findElement(By.xpath("//h2[@class ='_8eso']"));
		Boolean labelstatus = label.isDisplayed();
		if(labelstatus==true) {
			System.out.println(label.getText());
		}
		else {
			System.out.println("label is not displayed on the webpage");
		}
		WebElement crtnewacct = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		crtnewacct.click();
		
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("kari");
		
		Thread.sleep(1000);
		WebElement bday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel = new Select(bday);
		sel.selectByIndex(29);
		
		Thread.sleep(1000);
		WebElement bmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1 = new Select(bmonth);
		sel1.selectByValue("11");
		
		Thread.sleep(1000);
		WebElement byear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel2 = new Select(byear);
		sel2.selectByVisibleText("1993");
		
		Thread.sleep(1000);
		WebElement custmradbtn = driver.findElement(By.xpath("//input[@name='sex' and @value='-1']"));
		if(custmradbtn.isSelected()){
			System.out.println("custom radio button is already selected no need to select it again");
		}else {
			custmradbtn.click();
		}
		
		Thread.sleep(1000);
		WebElement custmbtntext = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		if(custmbtntext.isDisplayed()) {
			custmbtntext.sendKeys("custom gender");
		}else {
			System.out.println("custom button text is not displayed");
		}

	}

}
