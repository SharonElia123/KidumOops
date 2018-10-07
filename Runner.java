package KidumOops;

import SanityTest.junitTestSuiteSanity;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Iterator;


public class Runner

{public Runner() {
}

    public static void main(String[] args) throws InterruptedException {
        while (true)  {
        Result result = JUnitCore.runClasses(new Class[]{junitTestSuiteSanityA.class});
        Iterator var2 = result.getFailures().iterator();
        Thread.sleep(10000L);

        while(var2.hasNext()) {
            Failure failure = (Failure)var2.next();
            System.out.println(failure.toString());

        }

        System.out.println(result.wasSuccessful());
    }
}        }






