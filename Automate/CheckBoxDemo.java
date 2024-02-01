package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(3000);
		WebElement cb1= driver.findElement(By.xpath("//form[@action='#']//input[@class='Automation']"));
		WebElement cb2= driver.findElement(By.xpath("//form[@action='#']//input[@class='Performance']"));
		
	boolean status1=cb1.isDisplayed();
	System.out.println("check box1 displayed-->"+status1);
	
	boolean enabled1=cb1.isEnabled();
	System.out.println("checkbox1 is enabled-->"+enabled1);
	
	boolean selected1=cb1.isSelected();
	System.out.println("check box1 is selected-->"+selected1);
	cb1.click();
	boolean selected1_new=cb1.isSelected();
	System.out.println("check box1 is selected-->"+selected1_new);
	
	System.out.println("------check box2----");
	
	boolean status2=cb2.isDisplayed();
	System.out.println("check box2 displayed-->"+status2);
	
	boolean enabled2=cb2.isEnabled();
	System.out.println("checkbox2 is enabled-->"+enabled2);
	
	boolean selected2=cb2.isSelected();
	System.out.println("check box2 is selected-->"+selected2);
	
		cb2.click();
		

		boolean selected2_new=cb2.isSelected();
		System.out.println("check box2 is selected-->"+selected2_new);
		
		driver.close();
	     
}
	}