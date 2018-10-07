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


public class MinResultsPacakge extends  Utilitie{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void test5() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(3000L);
        //Pacakge Vacation Engine###############################
        driver.findElement(By.xpath("//*[@data-tab-type='deals']")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("ברלין");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='ui-menu-item']//*[contains(text(),'BER')]")).click();
        Thread.sleep(2000L);
       logger.info("Check Sabare Berlin");
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[1]/div/div/div/i[2]")).click();
         Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("רודוס");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@class='ui-menu-item']//*[contains(text(),'RHO')]")).click();
        logger.info("Check Sabare Rohdos");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[1]/div/div/div/i[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("אנטליה");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='ui-menu-item']//*[contains(text(),'AYT')]")).click();
        Thread.sleep(2000L);
        logger.info("Check Sabare Anatlya");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"dealsSearchForm\"]/div/div/div[1]/div/div/div/i[2]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"search_deals_dest_input\"]")).sendKeys("כרתים");
        Thread.sleep(1000L);
         driver.findElement(By.xpath("//*[@class='ui-menu-item']//*[contains(text(),'HER')]")).click();
        Thread.sleep(2000L);

        logger.info("Check Sabare Creatim");
        //Pacakge Vacation Creats###############################

        driver.get(test1+"/deals/searchresults?DestinationCode=50590&DealType=Vacation&FromDate=25.10.2018&ToDate=29.10.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");


        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        Thread.sleep(4000L);

        List<WebElement> createRes = driver.findElements(By.xpath("//*[@class='results-item product-result-item product-result-item-container row']"));

        Integer createResult =  createRes.size();
        System.out.println(createResult);
        if (createResult== 5)
        {
            System.out.println("Great Results Creats!!!!!");
        }
        else
        {
            logger.error("Bug In Results Creats!!!!!");
          }
        logger.info("Check Results Creatim");
         //Pacakge Vacation Berlin###############################
        driver.get(test1+"/deals/searchresults?DestinationCode=50178&DealType=Vacation&FromDate=04.10.2018&ToDate=09.10.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");


        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        Thread.sleep(4000L);


        List<WebElement> berlinRes = driver.findElements(By.xpath("//*[@class='results-item product-result-item product-result-item-container row']"));

        Integer berlinResult =  berlinRes.size();
        System.out.println(berlinResult);
        if (berlinResult== 5)
        {
            System.out.println("Great Results Berlin!!!!!");
        }
        else
        {
            logger.error("Bug In Results Berlin!!!!!");;
        }
        logger.info("Check Results Berlin");
      //Pacakge Vacation Rodhous###############################
        driver.get(test1+"/deals/searchresults?DestinationCode=50712&DealType=Vacation&FromDate=25.10.2018&ToDate=28.10.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");


        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        Thread.sleep(4000L);


        List<WebElement> rodRes = driver.findElements(By.xpath("//*[@class='results-item product-result-item product-result-item-container row']"));

        Integer rodResult =  rodRes.size();
        System.out.println(rodResult);
        if (rodResult== 5)
        {
            System.out.println("Great Results Rodhous!!!!!");
        }
        else
        {
            logger.error("Bug In Results Rodhous!!!!!");;
        }
        logger.info("Check Results Rodhous");
      //Pacakge Vacation Anatlia###############################
        driver.get(test1+"deals/searchresults?DestinationCode=65104&DealType=Vacation&FromDate=28.10.2018&ToDate=01.11.2018&Capacities%5B0%5D.Adults=2&Capacities%5B0%5D.Children=0&Capacities%5B0%5D.Infants=0");

        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        Thread.sleep(4000L);

      System.out.println("Great Results Anatlia!!!!!");
        List<WebElement> antRes = driver.findElements(By.xpath("//*[@class='results-item product-result-item product-result-item-container row']"));

        Integer antResult =  antRes.size();
      System.out.println(antResult);
        if (antResult== 5)
        {
            System.out.println("Great Results Anatlia!!!!!");
        }
        else
        {
            logger.error("Bug In Results Anatlya!!!!!");;
        }
        logger.info("Check Results Anatlya");

    /*    Thread.sleep(4000L);
    WebElement element1 = driver.findElement(By.xpath("//*[@href='https://mvctest1.eshet.com/deals/dealdetails/turkey/antalya/?startdate=22.03.2018&starttime=12:00:00&outboundflightid=446&enddate=25.03.2018&endtime=10:30:00&inboundflightid=445&destinationcode=65104&dealtype=1&sabresupplier=AV&hotelid=26201974&packageid=-780716455&vendor=3&searchkey=2_0_0-STANDARD ROOM_HB_3|']"));
    String actualValue = element1.getText();
    System.out.println(actualValue);*/
    }

    }