package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginORH {

	public static void main(String[] args)
	{
		String expName="Welcome Admin";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
String actName=driver.findElement(By.xpath(".//*[@id='welcome']")).getText();
if (expName.equals(actName)) 
{
	System.out.println("pass");
	
}else {
	System.out.println("Fail");
}
/*if (driver.findElement(By.xpath(".//*[@id='welcome']")).isDisplayed()) {
	System.out.println("pass");
}else
{
	System.out.println("Fail");
}*/

	}

}
