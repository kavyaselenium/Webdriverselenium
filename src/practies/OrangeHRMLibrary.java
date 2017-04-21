package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMLibrary 
{
public static FirefoxDriver driver;
String res;
	public  void appLaunch()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	public  void appLogin()
	{
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	}
	public  void appLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	public  void appClose()
	{
		driver.close();
	}
	
	public String  empAdd(String fName, String lName)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("employeeId")).sendKeys("1992");
		//Runtime.getRuntime().exec("C:\\Users\\star\\Desktop\\OrangeHRM.exe");
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
		{
			System.out.println("Emp Created Successfully");
			res="Pass";
		}else
		{
			System.out.println("Emp Creation Failed");
			res="Fail";
		}
		return res;
	}
}
