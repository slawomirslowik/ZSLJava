package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(welcomeMyFriend());

        ChromeOptions options = new ChromeOptions();
        WebDriver audiQ7 = new ChromeDriver(options);
    }

    private static String welcomeMyFriend() {
        return "Hello my friend!";
    }
}