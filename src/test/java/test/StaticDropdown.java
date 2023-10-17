package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

    //static dropdowns have a select id when you inspect it*****

    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new Firefox();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to Amazon
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //select option3 in the static dropdown.
        //we have to use Select class since we see select id in the inspect element.
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
            Select select = new Select(dropdown);
            for (WebElement option : select.getOptions()) { //enhanced forloop
            System.out.println(option.getText());
        }
        select.selectByValue("option2");
//        System.out.println(select.getOptions());


            Thread.sleep(3000);
            driver.close();

    }
}

