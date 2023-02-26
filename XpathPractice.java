package practice;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://52.221.112.102:8050/#!/authentication/login");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("Arivu");
		driver.findElement(By.xpath("//input[@ng-model=\"vm.user.password\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		

		driver.findElement(By.xpath("//span[text()='Registration']")).click();
		driver.findElement(By.xpath("//span[text()='OP Registration'][1]")).click();
		driver.findElement(By.xpath("//button[@ng-click=\"vm.skipSearch()\"]")).click();
		
		driver.findElement(By.xpath("//div[@id='demographicstitleMgsWrapper']")).click();
		driver.findElement(By.xpath("//input[@id='demographicstitleMgsNoParamsSearchInput']")).sendKeys("Mr");
		driver.findElement(By.xpath("//tr[@id='demographicstitleMgsGridOneRow0']"));
		driver.findElement(By.xpath("//input[@ng-model=\"vm.newPatient.firstname\"]")).sendKeys("Arivelan");
		driver.findElement(By.xpath("//input[@ng-model=\"vm.newPatient.lastname\"]")).sendKeys("Subramanian");
		driver.findElement(By.xpath("//input[@ng-model=\"vm.newPatient.contact.mobilephone\"]")).sendKeys("0585968523");
		
		driver.findElement(By.xpath("//div[@id='demographicstitleMgsWrapper']")).click();
		driver.findElement(By.xpath("//input[@id='demographicstitleMgsNoParamsSearchInput']")).sendKeys("Mr");


		/* driver.findElement(By.xpath("//md-icon[@ng-class=\"{ open: triMenuItem.item.open }\"][1]")).click();
	    driver.findElement(By.xpath("//button[@ng-click=\"triMenuItem.openLink(triMenuItem.item)\"][1]")).click();

		RemoteWebDriver elseScreeshot = null;
		File source= elseScreeshot.getScreenshotAs(OutputType.FILE);	
	    File target = new File("./snaps/leaftabsUsernamelab.png");
	    FileUtils.copyFile(source,target);*/
	}
}
