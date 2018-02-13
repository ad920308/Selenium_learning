package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeed_ResumeUpload {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		String Url = "https://www.indeed.co.in";
		driver.get(Url);
		driver.manage().window().maximize(); // maximize he browser
		WebElement Text_box1=driver.findElement(By.name("q"));//locator id is used
		//WebElement Text_box2=driver.findElement(By.name("l"));
        Text_box1.sendKeys("Testing"); //to send values in text box
        //Text_box2.clear(); 
        //Text_box2.sendKeys("Bhopal");
		driver.findElement(By.className("input_submit")).click();
          
		System.out.println("done");//To check it above  code executed completely
		
		driver.findElement(By.linkText("Upload your resume")).click();
		
		
		WebElement Upload_btn=driver.findElement(By.className("splash-upload"));
		
		System.out.println("done");
		
		//Upload_btn.click();
		Upload_btn.sendKeys(Keys.ENTER);


	}

}
