package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.cssSelector("div.Fgvgjc"));
		element.sendKeys("CSSセレクタとは");
		element.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}

}
