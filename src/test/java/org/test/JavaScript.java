package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	WebElement Txtuser = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value','mathi')",Txtuser);

	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", Txtuser);
	System.out.println(executeScript);

	WebElement textPass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','1234567')", textPass);


}
}
