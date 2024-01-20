import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstSelenium {


		
		public WebDriver driver;
		
		public void chromeBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	   driver=new ChromeDriver();
		
       driver.get("https:\\youtube.com\\satishkakimukkala");
       //Thread.sleep(5000);
       driver.manage().window().maximize();
       //Thread.sleep(5000);
       System.out.println(driver.getTitle());
       driver.close();
		
		}
		
		public void firefoxBrowser() throws InterruptedException {
			
			//System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://google.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.close();
		}

		
public void edgeBrowser() throws InterruptedException {
			
			System.setProperty("webdriver.edge.driver", "E:\\EdgeDriver\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://gmail.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.close();
		}

public static void main(String[] args) throws Exception {
	
	FirstSelenium fs= new FirstSelenium();
	int ch=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your choice of browser");
	System.out.println("1.chrome");
	System.out.println("2.firefox");
	System.out.println("3.edge");
	ch=Integer.parseInt(br.readLine());

	switch(ch)
	{
		case 1:
		        fs.chromeBrowser();
				break;
		case 2: fs.firefoxBrowser();
		        break;
		case 3: fs.edgeBrowser();
		        break;
		default: return;
	}




}
}