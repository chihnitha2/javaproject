package urbanladder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ecommerce {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.p.chihnitha\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	// open the urbanladder page by using URL//
	driver.get("https://www.urbanladder.com/");

	
	driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a")).click();
    Thread.sleep(3000);
    
    // login to that website by using email and password
    WebElement mail = driver.findElement(By.xpath("//input[@id='spree_user_email'][@autofocus='autofocus']"));
    mail.sendKeys("kpchihnitha79@gmail.com");
  mail.sendKeys(Keys.ENTER);
  WebElement password = driver.findElement(By.xpath("//input[@id='spree_user_password'][@placeholder='Password']"));
  password.sendKeys("chihnitha@79");
  driver.findElement(By.xpath("//input[@name='commit'][@id='ul_site_login']")).click(); // for login 
  Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sofas"); // search the product
driver.findElement(By.xpath("//*[@id=\'search_button\']/span")).click();   // click the enter

// the product is add to cart
 driver.findElement(By.xpath("//*[@id=\'search-results\']/div[3]/ul/li[1]/div/a[1]")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[@type='submit'][@id='add-to-cart-button']")).click();
 Thread.sleep(3000);
 // again go to shopping
 driver.findElement(By.xpath("//*[@id=\'update-cart\']/div/div[1]/div[3]/a")).click();
  
 
  
  
	}

}
