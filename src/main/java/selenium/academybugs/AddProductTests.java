package selenium.academybugs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.TestTemplate;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AddProductTests extends TestTemplate {

    @BeforeClass
    public void initPage() {
        page = "https://academybugs.com/find-bugs/";
        driver.get(page);
        acceptCookies();
    }

    private void acceptCookies() {
        List<WebElement> cookies = driver.findElements(By.xpath("//a[@aria-label='Accept cookies']"));
        for (WebElement c : cookies) {
            c.click();
        }
        System.out.println("Accepted cookies.");
    }

    @Test
    public void addedProductsInShoppingCart() {

        // First simple Example -  not working properly example-
        //        for (int i = 1 ; i <= 3; i++) {
        //            WebElement addButton = driver.findElement(By.id("ec_add_to_cart_" + i));
        //            addButton.click();
        //            pause(1);

        List<WebElement> addButtons = driver.findElements(By.xpath("//a[contains(@id,'ec_add_to_cart_')]"));
        System.out.println("addButtons = " + addButtons.size());

        for (WebElement button : addButtons) {
            if (button.isEnabled() && button.isDisplayed()) {
                button.click();
                System.out.println("button clicked = " + button.getAttribute("id"));
                pause(1);
            } else {
                System.out.println("button not clickable = " + button.getAttribute("id"));
            }
        }
    }

    @Test
    public void checkAddToCartButtons() {
        List<WebElement> addButtons = driver.findElements(By.xpath("//span[@class='ec_product_addtocart']/a"));
        System.out.println("addButtons = " + addButtons.size());

        for (WebElement button : addButtons) {
            if (button.isEnabled() && button.isDisplayed()) {
            Assert.assertEquals(button.getText(), "ADD TO CART");
            } else {
                System.out.println("button not clickable = " + button.getAttribute("id"));
            }
        }
    }

//    @Test(dependsOnMethods = "checkAddToCartButtons")
    @Test
    public void goToCartTest() {

        List<WebElement> addButtons = driver.findElements(By.xpath("//span[@class='ec_product_addtocart']/a"));
        System.out.println("addButtons = " + addButtons.size());

        int counter = 0;
        for (WebElement button : addButtons) {
            if (button.isEnabled() && button.isDisplayed()) {
                Assert.assertEquals(button.getText(), "ADD TO CART");
            } else {
                System.out.println("button not clickable = " + button.getAttribute("id"));
            }
            counter++;
            if (counter >= 3) break;
        }

        WebElement cartButton = driver.findElement(By.xpath("//a[@title='View Cart']"));
        cartButton.click();

        List<WebElement> itemsTotal = driver.findElements(By.xpath("//td[@class='ec_cartitem_total']"));
        List<String> totalPrices = new ArrayList<>();
        for (WebElement item : itemsTotal) {
            totalPrices.add(item.getText());
        }
        System.out.println(totalPrices);
    }
}