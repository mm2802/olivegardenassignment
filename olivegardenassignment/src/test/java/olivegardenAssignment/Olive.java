package olivegardenAssignment;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Olive {

	public static void main(String[] args) throws InterruptedException, IOException, MoveTargetOutOfBoundsException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.olivegarden.com/home");
		driver.manage().window().maximize();
		System.out.println("   Chrome launched...");
		
		WebElement login=driver.findElement(By.xpath("//*[@id='header-login-link']"));
		login.click();
		System.out.println("   Login button clicked...");
		
		

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(120));
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("customerLogoutId")));
		WebElement register=driver.findElement(By.id("customerLogoutId"));
		register.click();
		System.out.println("   Register button clicked...");
		

		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(120));
		w1.until(ExpectedConditions.presenceOfElementLocated(By.id("email-id")));	
		WebElement email=driver.findElement(By.id("email-id"));
		email.sendKeys("abc@gmail.com");
		WebElement fname=driver.findElement(By.name("vfirstName"));
		fname.sendKeys("Raj");
		WebElement lname=driver.findElement(By.name("vlastName"));
		lname.sendKeys("Kapoor");
		WebElement zipCode=driver.findElement(By.name("vpostalCode"));
		zipCode.sendKeys("444666");
		WebElement phoneNo=driver.findElement(By.name("vphonenumber"));
		phoneNo.sendKeys("9898989898");
		WebElement ext=driver.findElement(By.id("phoneExt"));
		ext.sendKeys("5");
		WebElement phoneType=driver.findElement(By.name("phoneType"));
		Select ddn1=new Select(phoneType);
		ddn1.selectByValue("Home");
		WebElement month=driver.findElement(By.name("vdobMonth"));
		Select ddn2=new Select(month);
		ddn2.selectByValue("8");
		WebElement day=driver.findElement(By.name("vdobDay"));
		Select ddn3=new Select(day);
		ddn3.selectByValue("15");
		WebElement year=driver.findElement(By.xpath("//*[@name='vdobYear']"));
		Select ddn4=new Select(year);
		ddn4.selectByValue("1947");
		WebElement psw=driver.findElement(By.xpath("//*[@name='vpassword']"));
		psw.sendKeys("1234556");
		WebElement findResto=driver.findElement(By.xpath("//*[@id='selectRestaurant']"));
		findResto.click();
		System.out.println("   Find Resto button clicked...");
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		WebElement enterCity=driver.findElement(By.id("searchText_overlay"));
		enterCity.sendKeys("Newyork");
		enterCity.sendKeys(Keys.ENTER);
		double a=700356;		
		List<WebElement> var=driver.findElements(By.xpath("//div[@class='casual_span_overlay']/div[@class='loc_span_grey_overlay border_top_0']/div[@class='row']/descendant::div[@class='span2 margin_lft_07_overlay']/span"));
		String myData="NYC - Times Square";
		System.out.println("   1");
		System.out.println(var.size());
		for(int i=0;i<=var.size()-1;i++)
		{
			System.out.println("   2 in for loop ");
			WebElement one=var.get(i);
			String dt=one.getText();
			if(dt.equals(myData))
			{
				System.out.println("  3 in if condition1");
				System.out.println(" Choose list - In loop");
				WebElement choose1=driver.findElement(By.xpath("//button[@id='"+a+"']"));
				choose1.click();
				break;
			}
			System.out.println(" Choose list out off the loop");
		 WebElement image = driver.findElement(By.linkText("https://media.olivegarden.com/images/site/close-btn.png"));
		 image.click();
		 System.out.println(" Close worked...");
		WebElement cheddarCheck=driver.findElement(By.xpath("//*[ @value='general-cheddars-logo']"));
		cheddarCheck.click();
		WebElement completeMyAccount=driver.findElement(By.xpath("//*[@id='register']"));
		completeMyAccount.click();
		System.out.print("Registration done...");
		
		
		//---------Careers---------------
		driver.get("https://www.olivegarden.com/customer-service/registration?redirectURL=%2fcustomer-service%2faccount-login&_requestid=10266");
		((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(4000);
		WebDriverWait w11=new WebDriverWait(driver,Duration.ofSeconds(120));
		w11.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'https://jobs.olivegarden.com/\']")));	
  		WebElement careers=driver.findElement(By.xpath("//*[@id=\'https://jobs.olivegarden.com/\']"));
  		careers.click();
  			ArrayList<String> wh=new ArrayList<String>(driver.getWindowHandles());
  			String mainWinHandId=wh.get(0);
  			for(i=1;i<=wh.size()-1;i++)
  			{
  				String s=wh.get(i);
  				driver.switchTo().window(s);
  				WebElement position=driver.findElement(By.xpath("//a[text()='Restaurant Manager']"));
  				position.click();
  				WebElement cookies=driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']"));
  				cookies.click();
  				Thread.sleep(4000);
  				List<WebElement> hotels=driver.findElements(By.xpath("//table[@class='jtable ui-widget-content']/tbody/tr[@role='link']/td[@class='reference-number-column']/span"));
  				String a1="58eb8ae7-a50e-4d72-bb8f-0ee46858d7fe";
  				String myData1="24712";
  				 System.out.println(hotels.size());
  				for(int i1=0; i1<=hotels.size()-1;i1++)
  				{
  					WebElement one1=hotels.get(i1);
  					String dt1=one1.getText();
  	  				System.out.println(dt1);
  					if(dt1.equals(myData1))
  					{
  						WebElement locationID=driver.findElement(By.xpath("//table[@class='jtable ui-widget-content']/tbody/tr[@data-record-key='"+a1+"']"));
  						locationID.click();
  						break;
  					}
  					
  				}
  				
  			}
  			driver.switchTo().window(mainWinHandId);
  			Thread.sleep(8000);
  			System.out.println("  Careers (Window handling)- Done");	
  			driver.close();
		}
		
	}
	

	}


