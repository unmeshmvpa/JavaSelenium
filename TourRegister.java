package Oct22.day1_javaintro;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TourRegister {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Contact information
		driver.findElement(By.name("firstName")).sendKeys("Unmesh");
		driver.findElement(By.name("lastName")).sendKeys("Damodaran");
		driver.findElement(By.name("phone")).sendKeys("3065416765");
		driver.findElement(By.id("userName")).sendKeys("unmesh.mvpa@gmail.com");
		
		// Mailing Information
		
		driver.findElement(By.name("address1")).sendKeys("3 Tumbleweed Trail");
		driver.findElement(By.name("city")).sendKeys("Brampton");
		driver.findElement(By.name("state")).sendKeys("Ontario");
		driver.findElement(By.name("postalCode")).sendKeys("L6Y 5A2");

		// Selecting country
		
		WebElement countryDropDownCombo = driver.findElement(By.name("country"));
		Select country = new Select(countryDropDownCombo);
		country.selectByValue("INDIA");
		country.selectByVisibleText("POLAND");
		country.selectByIndex(41);
		
		//User Information
		
		driver.findElement(By.id("email")).sendKeys("unmesh.mvpa@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("MavenPro123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("MavenPro123");
		driver.findElement(By.name("submit")).click();
		
		
		
		
	}

}
