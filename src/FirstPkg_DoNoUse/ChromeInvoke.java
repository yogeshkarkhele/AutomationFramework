package FirstPkg_DoNoUse;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.Listener.TestListerner;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestListerner.class)
public class ChromeInvoke extends BaseClass{

	//@Test(expectedExceptions = Exception.class)
	@Test
	public void test1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://uitestingplayground.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Dynamic']")).click();
		
		driver.findElement(By.className("tree-branch")).click();
		driver.findElement(By.id("treemenu")).click();
		driver.findElement(By.className("btn auth-btn sign-in-modal-opener btn-auth")).click();
		Thread.sleep(3000);
		Select select = new Select((WebElement) By.id("treemenu"));
		select.getOptions();
		select.selectByIndex(1);
		
		
		//System.out.println("Expcted--> Dynamic ID--"+driver.getTitle());
		assertEquals(driver.getTitle(), "Dynamic ID");
		driver.quit();
	}

   //@Test
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
