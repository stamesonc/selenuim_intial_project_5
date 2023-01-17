import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");


        WebElement logo = driver.findElement(By.className("col-sm-4"));

        System.out.println(logo.isDisplayed()); // true

        Driver.quitDriver();
    }
}
