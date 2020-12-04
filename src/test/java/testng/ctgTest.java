package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ctgTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void ctgOfNumberIsCorrect(double a, double result) {
        Assert.assertEquals(calculator.ctg(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 0.6420926159343306},
                {10, 1.5423510453569202},
                {4, 0.8636911544506165},
                {-1.24, -0.34341486494570933},
        };
    }

}
