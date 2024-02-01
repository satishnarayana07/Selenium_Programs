package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver wd=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		wd.get("https://facebook.com");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@id='email']")).sendKeys("kakimukkala.satishnarayana@gmail.com");
		wd.findElement(By.xpath("//input[@id='pass']")).sendKeys("satish_09");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("log in successful");
		Thread.sleep(7000);
	     wd.close();
		
	
	}

}
