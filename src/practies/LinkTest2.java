package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest2 {
	//http://newtours.demoaut.com/
	//http://newtours.demoaut.com/mercuryregister.php
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
	WebElement	header=driver.findElement(By.className("sw_tb"));
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
System.out.println(headerLinks.size());
for (int i = 0; i <headerLinks.size(); i++)
{
	if (!headerLinks.get(i).getText().isEmpty()) {
		System.out.println(headerLinks.get(i).getText());
	}
}
	}

}
