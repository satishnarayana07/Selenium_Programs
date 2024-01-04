import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {


		
		public WebDriver driver;
		
		public void chromeBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	   driver=new ChromeDriver();
		
       driver.get("https:\\youtube.com\\satishkakimukkala");
       //Thread.sleep(5000);
       driver.manage().window().maximize();
       //Thread.sleep(5000);
       System.out.println(driver.getTitle());
       driver.close();
		
		}
		
		public void firefoxBrowser() throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver", "C:\\FirefoxDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://google.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.close();
		}

		
public void edgeBrowser() throws InterruptedException {
			
			System.setProperty("webdriver.edge.driver", "C:\\EdgeDriver\\msedgedriver.exe");
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
	fs.chromeBrowser();
	fs.firefoxBrowser();
	fs.edgeBrowser();

}
}