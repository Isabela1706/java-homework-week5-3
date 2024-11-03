package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Firefox";
    static String baseURL = "https://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("This is wrong browser");
        }


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
