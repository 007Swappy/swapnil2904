package webdriverExamples;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class TC001_Login_Logoutt {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.firefox.driver", "path/to/firefoxdriver");

	        WebDriver driver = new FirefoxDriver();

	        driver.get("http://183.82.103.245/nareshit/login.php");

	        WebElement usernameField = driver.findElement(By.name("nareshit"));
	        WebElement passwordField = driver.findElement(By.name("nareshit"));

	        // Enter username and password
	        usernameField.sendKeys("nareshit");
	        passwordField.sendKeys("nareshit");

	        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	        loginButton.click();

	        try {
	            Thread.sleep(2000); // 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        WebElement logoutButton = driver.findElement(By.linkText("Log out"));
	        logoutButton.click();

	       
	        driver.quit();
	    }
	}

