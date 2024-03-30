//Chrome
package webdriverExamples;

	//Pre-def:
	//to access webdriver methods & classes
	import org.openqa.selenium.WebDriver;
	//to access browser
	import org.openqa.selenium.chrome.ChromeDriver;
	//to access object/element methods
	import org.openqa.selenium.By;

	public class TC001_Login_Logout {
		public static void main(String args[]) throws Exception{
			   //Test Steps
			//interface //classname
			WebDriver driver = new ChromeDriver(); 
			driver.navigate().to("http://183.82.103.245/nareshit/login.php"); 
			System.out.println("Application opened");
			Thread.sleep(3000);//wait time
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);//wait time
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login completed");
			Thread.sleep(3000);//wait time
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
			Thread.sleep(3000);//wait time
			driver.close();

			}
			}
	
