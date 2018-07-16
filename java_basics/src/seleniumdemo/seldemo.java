package seleniumdemo;
import org.openqa.selenium.*;
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;*/
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class seldemo {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(pass.uName);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass.password);
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.className("_3ixn")).click();;
		
		
		Thread.sleep(3000);
		driver.findElement(By.className("_5afe")).click();;
		//linkWrap noCount
		//driver.findElement(By.className("_5afe")).click();;
		//driver.findElement(By.linkText("Pratyush Kumar")).click();
		
		driver.close();
	}

}
