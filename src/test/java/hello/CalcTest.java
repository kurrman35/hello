package hello;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    private Calc calc = new Calc();    
   
    
    @Test
    public void testSum() throws Exception {
    	
    	  Assert.assertEquals(5, calc.sum(2,3));
    
    }
    
    @Test
    public void testMain()   {
    	 System.out.println("Xpath");
  	  WebDriver driver = new ChromeDriver();
	  
	   driver.get("http://localhost:8080/lord");
	   WebElement textBox1 = driver.findElement(By.name("name"));
       WebElement buttom=driver.findElement(By.xpath("//input[@value='Submit']"));
      
       System.out.println("Xpath");
       WebElement textBox = driver.findElement(By.name("age"));
       textBox.sendKeys("22");
       textBox1.sendKeys("николай");
       buttom.click();  
    }
    
}

