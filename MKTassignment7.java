package assignmentprograms;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MKTassignment7 {

	public static void main(String[] args) {
		FirefoxDriver sdemo =new FirefoxDriver();
		sdemo.manage().window().maximize();
		sdemo.get("https://grotechminds.com/registration/");
		sdemo.findElement(By.id("fname")).sendKeys("Adharsh");
		sdemo.findElement(By.id("lname")).sendKeys("V");
		sdemo.findElement(By.id("email")).sendKeys("adharshv32@gmail.com");
		sdemo.findElement(By.id("password")).sendKeys("Adharsh@123");
		sdemo.findElement(By.id("male")).click();
		WebElement e1 = sdemo.findElement(By.name("Skills"));
		Select s1 = new Select(e1);
		s1.selectByValue("select2");
		WebElement e2 = sdemo.findElement(By.id("nontechnicalskills"));
		Select s2 = new Select(e2);
		s2.selectByIndex(4);
		WebElement e3 = sdemo.findElement(By.name("Country"));
		Select s3 = new Select(e3);
		s3.selectByVisibleText("India");
		WebElement e4 = sdemo.findElement(By.id("Relegion"));
		Select s4 = new Select(e4);
		s4.selectByIndex(6);
		sdemo.findElement(By.id("Present-Address")).sendKeys("Rajapalayam");
		sdemo.findElement(By.name("Permanent-Address")).sendKeys("Rajapalayam-Tamil Nadu");
		sdemo.findElement(By.id("Pincode")).sendKeys("929922");
	}

}
