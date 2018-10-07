package KidumOops;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import java.util.concurrent.TimeUnit;


public class DiscountVsAfterVacationISR extends Utilitie{
   @Before
    public void openwindow() throws InterruptedException {
        openChrome();
        driver.get(test1+"domestichotels");//********************************************************************
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(4000L);
        //Orig Trip After Disc########################

        for (int i = 3; i <= 5; i++)

        {

            String discountPrice1 = driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div["+i+"]/article/div[2]/div[2]/div[2]/div[2]/span[1]")).getText();

            String discountPrice2 = discountPrice1.substring(1);
            String discountPrice3 = " ";
            if (discountPrice2.length() == 5) {

                discountPrice3 = discountPrice1.substring(0, discountPrice1.length() - 4) + discountPrice1.substring(discountPrice1.length() - 3);


            } else {
                discountPrice3 = discountPrice1;
            }

            int discountPrice4 = Integer.parseInt(discountPrice3);
            System.out.print("After Discount" + " " + " : " + discountPrice4 + " ");

            String discountPrice5 = driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div[" + i + "]/article/div[2]/div[2]/div[2]/div[1]/div")).getText();



            String discountPrice6 = discountPrice5.substring(1);
            String discountPrice7 = " ";
            if (discountPrice6.length() == 5) {

                discountPrice7 = discountPrice6.substring(0, discountPrice6.length() - 4) + discountPrice6.substring(discountPrice6.length() - 3);


            } else {
                discountPrice7 = discountPrice6;
            }

            int discountPrice8 = Integer.parseInt(discountPrice7);

            System.out.println(":" + " " + "Before Discount" + ":" + discountPrice8);
            if (discountPrice4 > discountPrice8 - (discountPrice8 * 0.3))

            {
                System.out.println("Great Discount is O.k VS Before");
            } else {

                System.out.println("Bug in Discount!!!!");
            }

            Thread.sleep(2000);
        }//driver.close();
    }}







