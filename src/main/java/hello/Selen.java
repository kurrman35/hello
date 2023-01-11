package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Selen {
 
 
	    public static void main(String[] args) { 
	    	
	    	System.out.println("Hello");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost:8080/lord");
	         
	        
	        List<WebElement> elements = driver.findElements(By.tagName("p"));

	        for (WebElement element : elements) {
	        	 List<WebElement> elements2=element.findElements(By.tagName("input")) ;
	        	  for (WebElement element2 : elements2) {
	        	if(element2.getAttribute("value").equals("Submit")){
		        	 		 System.out.println("fffff");
		        	// 		element2.click();	 
		        	 	}
	        	
		        
	        	 		 //	element2.click();	 
		        
	        		}
	        	  } 
	       
	     
	        
	        
	  //    driver.quit();
	        }
	    }


	 

