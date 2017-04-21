package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("u_0_e")).click();
		WebElement radio=driver.findElement(By.id("u_0_e"));
System.out.println(radio.getAttribute("checked"));
		

	radio.click();
	System.out.println(radio.getAttribute("checked"));

	}

}
