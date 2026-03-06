package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example {
    public static void main(String[] args) throws IOException, InterruptedException  { 
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\FirstClass\\target\\msedgedriver.exe");
   EdgeDriver driver = new EdgeDriver();
   driver.get ("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Location&gclsrc=aw.ds&gad_source=1&gad_campaignid=250395246&gbraid=0AAAAADLp3cH7oZF0fuql2S70_TIi5rvNb&gclid=CjwKCAiA-__MBhAKEiwASBmsBKJhF_3_xY6Ef1IEylZUAPlXZI6Lxlcjs-Cm3TTMrr1926cjyr1M-RoCzw4QAvD_BwE");
     
		  driver.findElement(By.xpath("(//div[@class='radioWrap']//following::h2)[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();
		  Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\Users\\DELL\\Documents\\Java.exec");
			 
         
    }
}