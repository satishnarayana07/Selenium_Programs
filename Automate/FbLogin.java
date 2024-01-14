package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogin  {

    WebDriver wd;
    void openBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("https://Facebook.com");
        wd.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(wd.getTitle());
        wd.quit();
    }
    }

class Amazon_Log extends FbLogin {

    void openBrowser() throws Exception {

        super.openBrowser();
        wd = new FirefoxDriver();
        wd.get("https://amazon.in");
        wd.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(wd.getTitle());
        wd.quit();
    }}

    class Test{

    public static void main(String[] args) throws Exception {

        Amazon_Log al=new Amazon_Log();
        al.openBrowser();
    } }






