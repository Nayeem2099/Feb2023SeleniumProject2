package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleNewWindow {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //click on the button to open a new window then grab text from the web element.
        driver.findElement(By.id("openwindow")).click();
        //selenium focuses on current window unless you use below method.
        Set<String> windows = driver.getWindowHandles(); //counts how many windows are opened, make a set of windows.
        Iterator<String> iterator = windows.iterator(); //turn into iterator to use "next" method
        String parentWind = iterator.next(); //go to the next iteration
        String childWind = iterator.next();

        driver.switchTo().window(childWind);
        System.out.println("switch to child window success"); //test to see if the switch was successful
        String text = driver.findElement(By.cssSelector(".header-opening-time.text-lg-right.text-center p")).getText();
        System.out.println(text);

        Thread.sleep(3000);

        driver.close();

        driver.switchTo().window(parentWind); //to close parent page.. or use driver.quit

        driver.close();
    }
}
