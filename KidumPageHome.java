package KidumOops;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class KidumPageHome extends Utilitie{

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(2000L);

        List<WebElement> LowPrice = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

        Integer sh =  LowPrice.size();
        System.out.println(sh);
             if (sh>30)
             {
                 System.out.println("Great Kidum!!!!!");
             }
            else
                {
                 System.out.print("Bug!!!!!");
             }
        Thread.sleep(2000L);
        List<WebElement> noImage = driver.findElements(By.xpath("//*[@src='https://www.eshet.com/images/global/white-background.jpg']"));
        Integer sha =  noImage.size();
        System.out.println(sha);
        if (sha>=1)
        {
            System.out.println("Bug No Image!!!!!");
        }
        else
        {
            System.out.print("Great there is Image in this Site!!!!!");
        }


  //    driver.close();

    }
}