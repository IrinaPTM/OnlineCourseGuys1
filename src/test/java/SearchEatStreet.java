import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchEatStreet {


    @Test
    public void searchMadison() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.eatstreet.com/");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Madison\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));
    }

    @Test
    public void searchBoston(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.eatstreet.com/");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Boston\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Boston"));
    }

    @Test
    public void searchDetroit(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.eatstreet.com/");
            driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Detroit\n");
            driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
            driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Detroit"));
        }
        @Test
        public void searchNewYork(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.eatstreet.com/");
            driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("New York\n");
            driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
            driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("New York"));
        }

}


