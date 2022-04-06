import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchBing extends TestInit {
    String searchEngine = "https://www.bing.com";

    @Test
    public void BingCats() {
        String searchWord = "cats";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void BingStraus() {
        String searchWord = "straus";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void BingHorse() {
        String searchWord = "horse";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

}
