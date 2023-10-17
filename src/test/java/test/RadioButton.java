package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

//        if (driver.findElement(By.name("radioButton")).getAttribute("value").equals("radio2")){
//            driver.findElement(By.name("radioButton")).click();
//        }

        //handle radio buttons dynamically
        List<WebElement> radioButtons = driver.findElements(By.name("radioButton"));

        for (WebElement radioButton : radioButtons){
            if (radioButton.getAttribute("value").equals("radio1")){
                radioButton.click();
            }
        }

        Thread.sleep(3000);

        driver.close();


    }

}
