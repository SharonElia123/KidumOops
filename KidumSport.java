package KidumOops;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class KidumSport extends Utilitie{

    @Before
    public void openwindow() throws InterruptedException {
      openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.get(test1+"sport");
        driver.manage().window().maximize();
        Thread.sleep(4000L);

        List<WebElement> kidumSport = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

        Integer sh =  kidumSport.size();
        System.out.println(sh);
        if (sh>5)
        {
            System.out.println("Great Kidum!!!!!");
        }
        else
        {
            System.out.print("Bug!!!!!");
        }

        driver.close();

    }
}