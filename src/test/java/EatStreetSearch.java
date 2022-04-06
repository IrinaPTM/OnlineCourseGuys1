import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EatStreetSearch extends TestInit {

    @Test
    public void searchMadison(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://qa2.eatstreet.com/");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Madison\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        sleep(10);
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filters-checkbox-delivery']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Free Delivery']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Rating 4+']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Order Ahead']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Specials']/..")).isDisplayed());
        }

    }