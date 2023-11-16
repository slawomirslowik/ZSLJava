package selenium.academybugs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.ChromeDriverSingleton;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BasicTests {

    String page = "https://academybugs.com/find-bugs/";

    //@Test(enabled = false)
    @Test
    public void openShop() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get(page);
    }

    @Test
    public void getItems() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get(page);

        List<WebElement> pagination = chrome.findElements(By.xpath("//a[@class='what-we-offer-pagination-link']"));

        for (WebElement e : pagination) {
            e.click();
        }
    }
}