package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
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
    }

    @AfterSuite
    public void quitWebDriver() {
        driver.close();
        driver.quit();
    }

    /**
     * Method pauses thread
     *
     * @param seconds
     *
     */
    protected void pause (int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
