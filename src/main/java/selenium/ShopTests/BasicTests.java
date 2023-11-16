package selenium.ShopTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.ChromeDriverSingleton;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BasicTests {

    private static String welcomeMyFriend() {
        return "Hello my friend!";
    }
    @Test(enabled = false)
    public void openShop() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get("https://academybugs.com/find-bugs/");
    }

    @Test
    public void getItems() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get("https://academybugs.com/find-bugs/");

        List<WebElement> pagination = chrome.findElements(By.xpath("//a[@class='what-we-offer-pagination-link']"));
        pagination.get(0).click();
    }
}