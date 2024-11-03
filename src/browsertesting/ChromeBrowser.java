package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

public class ChromeBrowser {

    static String baseURL = "https://the-internet.herokuapp.com/login";


    public static void main(String[] args) {


        //Set up Chrome browser.
        WebDriver driver = new ChromeDriver();
        //Open URL.
        driver.get(baseURL);

        //Set the screen view
        driver.manage().window().maximize();

        //set the timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Print the title of the page.
        System.out.println(driver.getTitle());

        //Print the current URL.
        System.out.println(driver.getCurrentUrl());

        //Print the page source.
        System.out.println(driver.getPageSource());

        //Enter the email in the email field.
        WebElement searchBox = driver.findElement(By.id("username"));
        searchBox.sendKeys("absv@gmail.com");

        //Enter the password in the password field.
        WebElement seachFiled = driver.findElement(By.name("password"));
        seachFiled.sendKeys("asbdhdfj");

        //Click on the Login Button.
        WebElement linkText = driver.findElement(By.className("fa-sign-in"));
        linkText.click();

        //Print the current URL.
        System.out.println("This is our current URL " + driver.getCurrentUrl());

        //Refresh the page.
        driver.navigate().refresh();


        //Close
        driver.close();

    }
}
