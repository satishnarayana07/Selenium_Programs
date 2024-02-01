package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(3000);
		WebElement radio=driver.findElement(By.xpath("//form[@action='#']//input[@id='female']")); //'male' also you can try
		boolean status= radio.isDisplayed();
		System.out.println("Radio button displayed status-->"+status);
		
		boolean enable=radio.isEnabled();
		System.out.println("Radio button enabled status-->"+enable);
		
		boolean selected=radio.isSelected();
		System.out.println("Radio button selected status-->"+selected);
		Thread.sleep(3000);
		radio.click();
		
		boolean sel=radio.isSelected();
		System.out.println("Radio button selected status-->"+sel);
		
		driver.close();
		}

}
