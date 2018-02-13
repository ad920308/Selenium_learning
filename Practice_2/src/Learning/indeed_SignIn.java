package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeed_SignIn {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		String Url = "https://www.indeed.co.in";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.id("userOptionsLabel")).click();
		driver.findElement(By.id("signin_email")).sendKeys("email");
		driver.findElement(By.id("signin_password")).sendKeys("password");
		driver.findElement(By.className("sg-btn.sg-btn-primary.btn-signin")).click();
		System.out.println("done");

	}

}
