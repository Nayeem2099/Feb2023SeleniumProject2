package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOver {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //hover over the button
        Actions actions = new Actions(driver);  // for mouse actions, we must use the Action class, use driver as parameter
        actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform(); //always add build perform to action class or it won't perform




        Thread.sleep(3000);

        driver.close();


    }

}
