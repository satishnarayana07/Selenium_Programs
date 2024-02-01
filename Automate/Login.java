package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

  class Amazon_Login {
	
	public WebDriver wd;
	
	public void browserOpen() { 

		  ChromeOptions opt=new ChromeOptions(); //To avoid ioexceptin and weblistener warning
		  opt.addArguments("--remote--allow-origins=*"); //To avoid ioexceptin and weblistener warning
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get("https://www.amazon.in/");
		System.out.println(wd.getTitle());
		wd.close();
	}
	}
  
  class Facebook_login extends Amazon_Login
  
  {
	  public void browserOpen() {  //override method
			
			System.setProperty("webdriver.gecko.driver", "C:\\FirefoxDriver\\geckodriver.exe");
			wd=new FirefoxDriver();
			wd.get("https://www.facebook.com/");
			System.out.println(wd.getTitle());
			wd.close();
		}
	  
	 }
  

  class Login {

	public static void main(String[] args) {
		
		Facebook_login fl=new Facebook_login();
		fl.browserOpen();
		Amazon_Login al=new Amazon_Login();
		al.browserOpen();
}


}