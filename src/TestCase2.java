import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.AutoExerciseUtil;
import utils.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        AutoExerciseUtil.getAutomationExercise();

        List<WebElement> headerItems = driver.findElements(By.className("#nav navbar-nav"));


        for(int i = 0; i <= 8; i++){
            System.out.println(headerItems.get(i).getText());
            System.out.println(headerItems.get(i).isDisplayed() && headerItems.get(i).isEnabled() ? "PASSED" : "FAILED");
        }

        Driver.quitDriver();

       //String[] exceptedTexts ={"Home", "Products", "Cart", "Signup/Login", "Test Cases", "API Testing",
       //                "Video Tutorials", "Contact us"};
       //int i =0;

       //for(WebElement headerItem :headerItems){
       //    System.out.println(headerItem.getText().equals(exceptedTexts[i++]));
       //    System.out.println(headerItem.isDisplayed());
       //    System.out.println(headerItem.isEnabled());
       //}

       //Driver.quitDriver();

    }
}
