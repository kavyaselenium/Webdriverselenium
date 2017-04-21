package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleRadioButtons {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
WebElement radio=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement> multipleRadios=radio.findElements(By.tagName("input"));
	System.out.println(multipleRadios.size());
	for (int i = 0; i < multipleRadios.size(); i++) 
	{
	//System.out.println(multipleRadios.get(i).getAttribute("checked")+"---"+multipleRadios.get(i).getAttribute("value"));
	if (multipleRadios.get(i).getAttribute("value").equals("Milk"))
	{
		multipleRadios.get(i).click();
	}
	}
		}
	}


