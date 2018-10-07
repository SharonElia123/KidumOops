package KidumOops;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.concurrent.TimeUnit;


public class KidumHotelNameHomePage extends Utilitie {
    @Before
    public void openwindow() throws InterruptedException {
     openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);

        for(int i=1; i<=3; i++)
        {

        String   nameHotel = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[1]/div/div[2]/div[1]/div["+i+"]/article/div[2]/div[1]/div[1]/div/a")).getText();
        System.out.println("Hotel Name" + ": " +" "+ nameHotel);

    }
        driver.close();









    }}