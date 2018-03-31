package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;


public class functions {
	
	
	public void enterText(String textboxname,String value){
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.name(textboxname)).sendKeys(value);
				}
	
	public static	File Userdirectory= new File(System.getProperty("user.dir"));
		
		String filepath = Userdirectory + "\\Desktop\\Book1.xlxs";
		
		
		public String getDataFromExcel (String sheetname,int rownum,int colnum){
			try {
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create;
			
			
			
			
			
			
			}
			catch (Exception e){System.out.println("Error Recieved");}
			
			
		}
		
		
		
		
	}


