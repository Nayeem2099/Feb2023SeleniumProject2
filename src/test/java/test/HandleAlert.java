package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //enter name, click alert, get text, confirm alert
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept(); //this is how to handle alerts **INTERVIEW QUESTION** .. you either accept or dismiss it
        Thread.sleep(3000);

        //enter name, click confirm , get text, confirm alert
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //enter name, click confirm , get text, cancel alert
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

        driver.quit();
    }

}
