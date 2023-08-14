import org.testng.annotations.Test;

public class TestngFeatures {


    @Test
    public void logintest(){
        System.out.println("login test");
    }

    @Test(dependsOnMethods = "logintest")
    public void HomepageTest(){
        System.out.println("Homepage test");
    }

    @Test
    public void logintest32(){
        System.out.println("Hello i m the last login");
    }

    @Test(invocationCount = 10)
    public void Inovationcoutner(){
        int a=12;
        int b =12;
        int c=a+b;
    }

    @Test(invocationTimeOut = 20000)
    public void invocationtimeout(){
        System.out.println("Some program run infintely if it does not get execute withing this time it will be terminated");
        System.out.println("Some program run infintely");
        System.out.println("Some program run infintely");

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void ExpectedExecption(){
      String x ="100A";
      Integer.parseInt(x);

    }
}
