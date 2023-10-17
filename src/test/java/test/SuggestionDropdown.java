package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionDropdown {

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //select Canada in the suggestion dropdown
        //you can have more than one parameter in sendKeys method.. Use the Keys enum to insert directions
        //inspect element to see if there's only one unique id.
        //selenium is so fast that sometimes you need to add extra arrow down for it to go down to the specific desired place ("Canada")
        //driver.findElement(By.id("autocomplete")).sendKeys("can", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

        driver.findElement(By.id("autocomplete")).sendKeys("can");
        Thread.sleep(2000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);


        Thread.sleep(3000);
        driver.close();


    }
}
