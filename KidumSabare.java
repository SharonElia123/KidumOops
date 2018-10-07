package KidumOops;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.apache.poi.hwpf.model.FileInformationBlock.logger;


public class KidumSabare extends Utilitie{

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
        driver.get(test1+"deals/germany/berlin/");//****************************************************
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    @Test
    public void test3() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
       List<WebElement> LowPrice = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));
        Integer sh =  LowPrice.size();
        System.out.println(sh);

        if (sh>5)
        {
            System.out.println("Great Kidum Berlin!!!!!");
        }
        else
        {
            System.out.print("Bug Kidum In Berlin!!!!!");
        }
        logger.info("Check Kidum Berlin");
       Thread.sleep(2000);
        driver.get(test1+"deals/greece/crete/");//**********************************************************
        List<WebElement> LowPrice1 = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

        Integer sh1 =  LowPrice1.size();
        System.out.println(sh1);
        if (sh>5)
        {
            System.out.println("Great Kidum Create!!!!!");
        }
        else
        {
            System.out.print("Bug Kidum In Crete!!!!!");
        }

        logger.info("Check Kidum Creatim");
        Thread.sleep(2000);
        driver.get(test1+"/deals/greece/rhodes/");//********************************************************
        List<WebElement> LowPrice2 = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

        Integer sh2 =  LowPrice2.size();
        System.out.println(sh2);
        if (sh>5)
        {
            System.out.println("Great Kidum Rhodes!!!!!");
        }
        else
        {
            System.out.print("Bug Kidum In Rhodes!!!!!");
        }
        logger.info("Check Kidum Rhodos");
        Thread.sleep(2000);
        driver.get(test1+"/deals/turkey/antalya/");//***************************************************
        List<WebElement> LowPrice3 = driver.findElements(By.xpath("//*[@class='img_wrapper relative']"));

        Integer sh3 =  LowPrice3.size();
        System.out.println(sh3);
        if (sh>5)
        {
            System.out.println("Great Kidum Antalya!!!!!");
        }
        else
        {
            System.out.print("Bug Kidum In Antalya!!!!!");
        }
        logger.info("Check Kidum Anatlya");

       // driver.close();

    }}