import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AutoExerciseUtil;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        AutoExerciseUtil.getAutomationExercise();

        System.out.println(driver.findElement(By.cssSelector("div[class='single-widget'] h2")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//form[@class='searchform']//input[2]")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("i[class='fa fa-arrow-circle-o-right']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//form[@class='searchform']//p")).isDisplayed());


        Driver.quitDriver();
    }
}
