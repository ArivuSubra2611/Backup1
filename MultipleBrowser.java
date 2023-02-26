package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://leaftaps.com/opentaps/");
   driver.findElement(By.id("//input[@id='username']")).sendKeys("DemoSalesManager");
   driver.findElement(By.id("//input[@id='password']")).sendKeys("crmsfa");
   driver.findElement(By.className("//input[@class='decorativeSubmit']")).click();
   //driver.close();
   EdgeDriver driver1 = new EdgeDriver();
   driver1.get("https:facebook.com");
   //driver1.close();
   
	}

}
