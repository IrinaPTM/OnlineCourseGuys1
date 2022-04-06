import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle {

  @Test
   public void googleSomeWord(){
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();

     driver.get("https://www.google.com.ua/");
     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dogs\n");

      Assert.assertTrue(driver.getCurrentUrl().contains("dogs"));
      driver.quit();
   }

   @Test
   public void googleCats(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

       driver.get("https://www.google.com.ua/");
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cats\n");

       Assert.assertTrue(driver.getCurrentUrl().contains("cats"));
       driver.quit();
   }
   @Test
      public void googleStraus(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

       driver.get("https://www.google.com.ua/");
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Straus\n");

       Assert.assertTrue(driver.getCurrentUrl().contains("Straus"));
       driver.quit();
   }

   @Test
   public void googleHorse(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

       driver.get("https://www.google.com.ua/");
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Horse\n");

       Assert.assertTrue(driver.getCurrentUrl().contains("Horse"));
       driver.quit();

   }

}
