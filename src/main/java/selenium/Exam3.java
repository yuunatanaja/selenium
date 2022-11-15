package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.e-procurement.metro.tokyo.lg.jp/index.jsp");
		WebElement element = driver.findElement(By.cssSelector("body > div.noticeofurlchange > div > button"));
		element.click();
		WebElement element2 = driver.findElement(By.cssSelector("#category_menu > ul > li.cat_menu_1 > a:nth-child(1) > img"));
		element2.click();
		//全てのウィンドウハンドル（各ウィンドウに割り振る管理番号）を取得
		Set<String> handles = driver.getWindowHandles();
		//それぞれのウィンドウハンドルを別々の変数に保管
		Iterator<String> ite = handles.iterator();
		//2個入ってるけど1個いらないから上書き(次の要素を返す）
		String handleStr = ite.next();
		handleStr = ite.next();
		//２個目のウィンドウに移る
		driver.switchTo().window(handleStr);

		
//	    WebElement element3 = driver.findElement(By.cssSelector("#topMenuBtn03 > a"));
//		element3.click();
	    driver.findElement(By.cssSelector("#topMenuBtn03 > a")).click();
	    Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(2)"));
		element4.sendKeys("4");
		WebElement element5 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(3)"));
		element5.sendKeys("11");
		WebElement element6 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(4)"));
		element6.sendKeys("15");
		WebElement element7 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(8)"));
		element7.sendKeys("4");
		WebElement element8 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(9)"));
		element8.sendKeys("12");
		WebElement element9 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(10)"));
		element9.sendKeys("15");
		Thread.sleep(2000);
		WebElement element10 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table:nth-child(2) > tbody > tr > td > a"));
		element10.click();
		
		WebElement tableElements = driver.findElement(By.cssSelector("table.list-data"));
		List<WebElement> trElements = tableElements.findElements(By.tagName("td"));
		int count = 0;
		for(WebElement tdElem : trElements) {
			if(count < 3) {
				System.out.println(tdElem.getText() + "\t");
			
			if(count == 2) {
				String hrefStr = tdElem.findElement(By.tagName("a")).getAttribute("href");
				System.out.println(hrefStr + "\t");
			}
			
			count++ ;
		}
		
		
		
		
		
	
		
		
		
		
		

	}

	}}
