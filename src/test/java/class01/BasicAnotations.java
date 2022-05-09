package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnotations {
    @Test
    public void  firstTest(){
        System.out.println("This is my first test");
    }
    @Test
    public void asecongtest(){
        System.out.println("Second Test Case");
    }
    @Test
    public void thirdtest(){
        System.out.println("Third Test Case");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("****************I am Precondition*********");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("****************I am Postcondition*********");
    }
}
