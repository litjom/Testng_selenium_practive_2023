import org.testng.ITestListener;

import java.io.IOException;

public class CustomListner extends Baseclass implements ITestListener {

    @Override
    public void onTestFailure(ITestListener result) throws IOException {
        System.out.println("Failed test case");
        failed();
    }
}
