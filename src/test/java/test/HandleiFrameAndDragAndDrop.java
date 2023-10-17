package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleiFrameAndDragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://jqueryui.com/droppable/");

        //click on the element inside hte frame
        driver.switchTo().frame(0);
        System.out.println("Switch to IFrame success");

        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();

        Thread.sleep(3000);

        driver.close();


    }

}
