package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rakuplus.jp");
		WebElement element = driver.findElement(By.cssSelector("#user_login"));
		element.sendKeys("yuna.tanaka@rakus-partners.co.jp");
		WebElement element2 = driver.findElement(By.cssSelector("#user_pass"));
		element2.sendKeys("yuna.tanaka@rakus-partners.co.jp");
		element2.submit();
		WebElement element3 = driver.findElement(By.cssSelector("#categories-3 > ul > li.cat-item.cat-item-2 > ul > li.cat-item.cat-item-48 > a"));
		element3.click();
		WebElement element4 = driver.findElement(By.cssSelector("#main > div.cardtype.cf > article:nth-child(1) > a"));
		element4.click();
		//セクションで取り出す
		List<WebElement> divElemList = driver.findElements(By.cssSelector("entry-content.cf"));
		int count = 0 ;
		for(WebElement elem : divElemList) {
			if(count > 0) {
				WebElement imgElem = elem.findElement(By.cssSelector("#sgb-css-id-2 > p > strong > span"));
				System.out.println(imgElem);
				System.out.println(elem.getText());
				System.out.println("-------------------");
			}
		}
		
		
		

	}

	}
