package PostmanLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PostmanLoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //fetch URL to automate
        driver.get("https://identity.getpostman.com/login?addAccount=1");
        Thread.sleep(5000);

        // maximize ta page of your browser while page loads
        driver.manage().window().maximize();

        // get page title
        System.out.println(driver.getTitle());

        // make page wait while url fully loads
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("username")).sendKeys("henryt1455@gmail.com");
        driver.findElement(By.id("password")).sendKeys("7BU@great");
        driver.findElement(By.id("sign-in-btn")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        PostmanLoginTests test = new PostmanLoginTests();
        test.setUp();
    }

}
