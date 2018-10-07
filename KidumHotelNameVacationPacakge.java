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


public class KidumHotelNameVacationPacakge extends Utilitie{
    @Before
    public void openwindow() throws InterruptedException {
       openChrome();
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.get(test1+"deals/");
        driver.manage().window().maximize();
        Thread.sleep(4000L);

        for(int i=1; i<=4; i++)
        {

        String   nameHotel = driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div["+i+"]/article/div[2]/div[1]/div[2]/span")).getText();
        System.out.println("Hotel Name" + ": " +" "+ nameHotel);

    }
      driver.close();









    }}