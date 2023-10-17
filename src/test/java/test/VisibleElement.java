package test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibleElement {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //click on hide, check if the element is not visible
        //click on show and check that the element is visible
        driver.findElement(By.id("hide-textbox")).click();
        Assert.assertFalse(driver.findElement(By.id("displayed-text")).isDisplayed());

        Thread.sleep(3000);

        driver.findElement(By.id("show-textbox")).click();
        Assert.assertTrue(driver.findElement(By.id("displayed-text")).isDisplayed());

        Thread.sleep(3000);

        driver.close();

    }
}
