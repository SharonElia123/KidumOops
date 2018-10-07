package KidumOops;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test2.Util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class KidumPackOops extends Utilitie{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void packName() throws InterruptedException, FindFailed, IOException, InvalidFormatException {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        for(int i=1;i<=5;i++)
        {
            String pac = " ";
            switch (i) {
                case 1:
                    pac = "1";//Tourist
                    break;
                case 2:
                    pac = "5";
                    break;
                case 3:
                    pac = "7";//Buisness
                    break;
                case 4:
                    pac = "8";//First Class
                    break;
                case 5:
                    pac = "3";//First Class
                    break;
                default:
                    pac = "8";//Sharon
                    break;}
            checkPack(pac);

        }//Case Package
        logger.info("2+Great, Complete test PackOops");
    }

    public void checkPack(String pac) throws IOException, InvalidFormatException, InterruptedException {

        WebElement searchBtn = driver.findElement(By.xpath("(//*[@class='menu-nav--item has-mega-menu'])[5]"));////*[@id="6"]/a
        Actions action = new Actions(driver);
        action.moveToElement(searchBtn).perform();
        Thread.sleep(500L);
        driver.findElement(By.xpath("(//*[@class='sub-menu-new'])[12]/li["+pac+"]")).click();
        Thread.sleep(500L);
        try {
            driver.findElement(By.xpath("//*[@id=\"promotion-group-tab-0\"]/div[1]/div/div[1]/article/div[1]/img")).click();
        }
        catch(Exception e)
        {
            driver.findElement(By.xpath("(//*[@class='img_wrapper relative'])[1]")).click();
        }

        Thread.sleep(500L);
        System.out.println(pac);
        startTestOops();
        Thread.sleep(500L);
        driver.get(test1);
        Thread.sleep(500L);
    }


    public void startTestOops() throws IOException, InvalidFormatException, InterruptedException {

        logger.info("Great, Start test Oops");
        String currentUrl = driver.getCurrentUrl();
        Thread.sleep(500);
        TestPage(currentUrl);
    }

    public void TestPage(String origLink) throws InterruptedException, IOException, InvalidFormatException {
        try {

            driver.get(origLink);
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            Thread.sleep(500);
            driver.manage().window().maximize();
            Thread.sleep(500L);

            String oops= driver.getTitle();
            if (oops.isEmpty())

            {
                System.out.println("We got OOPS"+" " +driver.getCurrentUrl());


            }

            else{
                System.out.println("great Pack Link");
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










































