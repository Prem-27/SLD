package selenium;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.server.handler.html5.GetSessionStorageItem;
public class selenium {

	/**
	 * @param args
	 */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New workspace\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		
		/*
		 driver.get("https://www.wyndhamhotels.com/ramada");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(arg0, arg1)
		
	    */
		
		driver.get("https://www.cleartrip.com/");
		
	
		/*List<WebElement> radiobtns = new ArrayList<WebElement>();
		radiobtns = driver.findElements(By.name("color"));
		
		for(int i=0;i<radiobtns.size();i++){
			if(radiobtns.get(i).getAttribute("checked") != null && radiobtns.get(i).getAttribute("checked").equals("true")){
				System.out.println(radiobtns.get(i).getAttribute("value") + " checked");
			}
		}
		*/
		
		//WebElement radiobtn = driver.findElement(By.id("RoundTrip"));
	//	radiobtn.click();
		

		WebElement From = driver.findElement(By.id("FromTag"));
		From.sendKeys("BLR");
		
		WebElement To = driver.findElement(By.id("ToTag"));
		To.sendKeys("Patna");
		
		

		WebElement Date1 = driver.findElement(By.id("DepartDate"));
		Date1.sendKeys("Fri, 15 Sep, 2017");
		

		//WebElement Date = driver.findElement(By.id("ReturnDate"));
//		Date.sendKeys("Tue, 18 Jul, 2017");

		WebElement Searchbtn = driver.findElement(By.id("SearchBtn"));
		Searchbtn.click();		

		List<WebElement> Price = new ArrayList<WebElement>();
		Price = driver.findElements(By.className("price"));
		for(WebElement w : Price){
			w = w.findElement(By.tagName("span"));
			System.out.println(w.getAttribute("data-pr")+" "+w.getAttribute("class"));
		}
		//System.out.println(Price);
		
		String Title = "Book Cheap Air Tickets, Domestic Flight Ticket Booking at Lowest Airfare on Cleartrip.";
		String GetTitle =driver.getTitle();
		System.out.println("Assetion");
		Assert.assertEquals(Title, GetTitle);
		System.out.println("True");
	//driver.close();
		
		
		
		
	}

}
