package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class TestTemplate {

    public WebDriver driver;
    public String page;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSingleton.getChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
