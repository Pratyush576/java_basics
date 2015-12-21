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
		
		//driver.get("http://stageweb.vizury.com");
		//driver.findElement(By.xpath("//*[@id=\"menu-item-5\"]/a")).click();;
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("pratyushcse07@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("pratyush576");
		//*[@id="u_0_v"]
		driver.findElement(By.cssSelector("#persist_box")).click();
		//driver.findElement(By.xpath("//*[@id=\"persist_box\"]")).click();;
		//driver.findElement(By.partialLinkText("Log In")).click();;//("//input[@value='Log In']");
		//driver.findElement(By.className("uiButton uiButtonConfirm")).click();;//.xpath("//*[@id=\"u_0_v\"]")).submit();
		driver.findElement(By.id("loginbutton")).click();;
		//driver.wait(5000);
		//new Thread().sleep(10000);
		driver.close();
		//System.out.println(System.getProperty("user.dir"));
	}

}
