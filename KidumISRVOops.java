package KidumOops;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;

public class KidumISRVOops extends Utilitie{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
   @Test
    public void packName() throws InterruptedException, FindFailed, IOException, InvalidFormatException {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
       for(int i=1;i<=6;i++)
       {
       String pac = " ";
       switch (i) {
           case 1:
               pac = "מלונות באילת";//Tourist
               break;
           case 2:
               pac = "מלונות ים המלח";
               continue;
           case 3:
               pac = "מלונות בתל אביב";//Buisness
               break;
           case 4:
               pac = "מלונות בירושלים";//First Class
               break;
           case 5:
               pac = "מלונות בחיפה";//First Class
               break;
           case 6:
               pac = "מלונות בצפון";//First Class
               break;
           default:
               pac = "מלונות בנתניה";//Sharon
               break;}
           checkPack(pac);
       }//Case Package
       logger.info("1+Great, Complete test IsrOops");
    }

    public void checkPack(String pac) throws IOException, InvalidFormatException, InterruptedException {

        WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/header/div/div[2]/div/div/ul/li[2]/a"));////*[@id="11"]/a
        Actions action = new Actions(driver);
        action.moveToElement(searchBtn).perform();
         Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[contains(text(),'"+pac+"')]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div[1]/article/div[1]/img")).click();
        Thread.sleep(1000L);
        System.out.println(pac);
        startTestOops();
        Thread.sleep(1000L);
        driver.get(test1);
        Thread.sleep(1000L);

        }


    public void startTestOops() throws IOException, InvalidFormatException, InterruptedException {

        logger.info("Great, Start test Oops");
        String currentUrl = driver.getCurrentUrl();
        Thread.sleep(1000);
        TestPage(currentUrl);
    }

    public void TestPage(String origLink) throws InterruptedException, IOException, InvalidFormatException {
        try {

            driver.get(origLink);
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            Thread.sleep(1000);
            driver.manage().window().maximize();
            Thread.sleep(1000L);

            String oops= driver.getTitle();
            if (oops.isEmpty())

            {
                System.out.println("We got OOPS"+" " +driver.getCurrentUrl());


            }

            else{
                System.out.println("great Israel Pack Link");
            }

        } catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace();
            System.err.println(shortenedStackTrace(e, 1));

        }}
    public  String shortenedStackTrace(Exception e, int maxLines) {
        StringWriter writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer));
        String[] lines = writer.toString().split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(lines.length, maxLines); i++) {
            sb.append(lines[i]).append("\n");
        }
        return sb.toString();
    }

}
































