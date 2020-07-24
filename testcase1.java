package com_trivango_generic;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import java.util.Iterator;

public class testcase1 extends basetest
{
@Test (priority =1)

public void scenario() throws InterruptedException
{
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.findElement(By.id("querytext")).sendKeys("Bengaluru");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//li[@id='suggestion-64975/200']//span[@class='ssg-title']"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn--primary btn--regular search-button js-search-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='icon-ic icon-contain fill-maincolor-04-light']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'Rating only')]")).click();
	Thread.sleep(5000);
    
			for (int i=1; i<=29; i++ )
			{
				try
				{
				String disp = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ol[1]/li["+i+"]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/h3[1]/span[1]")).getText();
				Thread.sleep(1000);
				System.out.println(disp);
				}
				catch(Exception E)
				{
				continue;
				}
		
			}
			Thread.sleep(1000);
			
			WebElement element =driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div/div[4]/div/div/div[2]/div[1]/div/section/ol/li[1]/div/article/div[1]/div[2]/section/div[1]/article/div"));
			Thread.sleep(1000);
			Actions actions=new Actions(driver); actions.moveToElement(element).click().perform();
			driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div/div[4]/div/div/div[2]/div[1]/div/section/ol/li[1]/div/article/div[1]/div[2]/section/div[1]/article/div")).click();
			Set<String> tabs = driver.getWindowHandles();
			Iterator<String> it = tabs.iterator();
			//String tab1 = it.next();
			String tab2=it.next();
			String tab3=it.next();
			driver.switchTo().window(tab2);
			//Getting page pop up as access denied. unable to validate further.
			driver.findElement(By.xpath("/html/body/div[15]/div/div[4]/div/div/div[2]/div[1]/div[4]/ol/li[1]/div[2]/a/div/div[3]/div")).click();
			driver.switchTo().window(tab3);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[15]/div/div[7]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[5]/div/div/div[1]/button")).click();
			
			driver.findElement(By.xpath("/html/body/section/div/div/form/div[5]/div/div[4]/button")).click();		
			for (int i=1; i<=10; i++ )
			{
				try
				{
					String disp = driver.findElement(By.xpath("/html/body/section/div/div/form/div[3]/div[2]/div[1]/div["+i+"]")).getText();
					Thread.sleep(1000);
					System.out.println(disp);
					
				}
				catch (Exception E)
				{
					continue;
				}
			}
			
			
 }
}

