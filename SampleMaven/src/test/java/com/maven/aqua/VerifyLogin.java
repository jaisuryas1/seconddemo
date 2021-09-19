package com.maven.aqua;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.maven.aqua.Login ;
 
/**
* @author Mukesh_50
*
*/
public class VerifyLogin 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:/Users/jaisuryas/eclipse-workspace-Picnicselenium/Projectselenium/drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
Login login=new Login(driver);
 
Thread.sleep(3000);
login.loginToWordpress("Admin","admin123");
Thread.sleep(5000);
File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
try {
    FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\orghrmScreenshot.png"));
} catch (IOException e) {
    System.out.println(e.getMessage());
}
 
 
driver.quit();
 
}
 
 
}


