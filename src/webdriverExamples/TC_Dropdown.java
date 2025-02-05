package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[]) throws Exception{
   //Test Steps
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login completed");
//ENter into frame
driver.switchTo().frame("rightMenu");
Select st = new Select(driver.findElement(By.name("loc_code")));
//st.selectByVisibleText("Emp. ID");
//st.selectByIndex(1);
st.selectByValue("0");
Thread.sleep(4000);
driver.findElement(By.name("loc_name")).sendKeys("10045");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(4000);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(4000);
//exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("Logout completed");
driver.close();
}
}
