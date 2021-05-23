package FirstPkg_DoNoUse;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeInvoke2 extends BaseClass{

	@Test()
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://uitestingplayground.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Dynamic ID']")).click();
		Thread.sleep(3000);
		System.out.println("Expcted--> Dynamic ID--"+driver.getTitle());
		driver.quit();
	}

   @Test
	public void test2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://uitestingplayground.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Class Attribute']")).click();
		Thread.sleep(3000);
		System.out.println("Expcted-->Class Attribute--"+driver.getTitle());
		driver.quit();
	}

}
