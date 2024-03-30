package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Frames {
public static void main(String args[]) throws Exception{
   //Test Steps
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login completed");
//Enter into frame
driver.switchTo().frame("rightMenu");
//click on Add btn
driver.findElement(By.xpath("//input[@value='Add'][@class='plainbtn']")).click();
Thread.sleep(3000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("swappy");
driver.findElement(By.name("txtEmpLastName")).sendKeys("patil");
Thread.sleep(3000);
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
System.out.println("New emp added");
//Exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
System.out.println("Testing Excellent");
}
}
