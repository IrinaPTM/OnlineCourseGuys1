import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestYahoo extends TestInit {
    String searchEngine = "https://www.search.yahoo.com";

    @Test
    public void YahooDogs() {
        String searchWord = "dogs";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void YahooCats() {
        String searchWord = "cats";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void YahooStraus() {
        String searchWord = "straus";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void YahooHorse() {
        String searchWord = "horse";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    public void search(String yahooWord) {
        driver.get(searchEngine);
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys(yahooWord + "\n");
    }
}
