package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_log_in {
	
	public WebDriver wd;
	
	public void openBrowser() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		//wd=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\FirefoxDriver\\geckodriver.exe");
		//wd=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "C:\\EdgeDriver\\msedgedriver.exe");
		wd=new EdgeDriver();
		wd.get("https://accounts.google.com/signin");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("gmail page has opened"+"-"+wd.getTitle());
		//wd.quit();
	}
	
	public void inputCred() throws InterruptedException {
		
		wd.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("satishnarayana.k@gmail.com");
		Thread.sleep(5000);
		wd.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][text()='Next']")).click();
		System.out.println("Unfortuantely Google products have not accepting log in through Third party websites");
		System.out.println("Hence skipping the log in process. please use other appliactions like Facebook,Flipkart,Amazon.");
		System.out.println("THANK YOU!!");
		wd.quit();
		
	}
	
	//input[@id='identifierId']
	
	
	public static void main(String[] args) throws Exception {
		
		Gmail_log_in gl=new Gmail_log_in();
		gl.openBrowser();
		gl.inputCred();
		
	}
	
	
}
