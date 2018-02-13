package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeed_SignIn {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		String Url = "https://www.indeed.co.in";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.id("userOptionsLabel")).click();
		System.out.println("test");
		WebElement TextBox1 = driver.findElement(By.name("__email"));
		TextBox1.sendKeys("email");
		driver.findElement(By.name("__password")).sendKeys("password");
		driver.findElement(By.className("sg-btn.sg-btn-primary.btn-signin")).click();
		System.out.println("done");

	}

}
