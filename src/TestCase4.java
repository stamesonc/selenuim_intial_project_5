import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AutoExerciseUtil;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        AutoExerciseUtil.getFrontendTesting();

        System.out.println(driver.findElement(By.cssSelector("p[class='pull-left']")).isDisplayed());

        Driver.quitDriver();

    }
}
