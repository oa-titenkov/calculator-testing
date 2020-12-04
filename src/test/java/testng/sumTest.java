package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sumTest extends CommonConditions {

    @Test(dataProvider = "dataLong")
    public void sumOfLongNumbersIsCorrect(long a, long b, long result) {
        Assert.assertEquals(calculator.sum(a, b), result);
    }

    @Test(dataProvider = "dataDouble", groups = "doubleDataGroup")
    public void sumOfDoubleNumbersIsCorrect(double a, double b, double result) {
        Assert.assertEquals(calculator.sum(a, b), result);
    }

    @DataProvider(name = "dataLong", parallel = true)
    public Object[][] dataLongProvider() {
        return new Object[][]{
                {1, 1, 2},
                {-1, -1, -2},
                {0, 0, 0},
                {22222222L, 22222222L, 44444444L},
                {-1, -1, -2},
                {-1, -1, -2},
                {Long.MAX_VALUE, -1, Long.MAX_VALUE - 1},
        };
    }

    @DataProvider(name = "dataDouble", parallel = true)
    public Object[][] dataDoubleProvider() {
        return new Object[][]{
                {1.1, 1, 2.1},
                {-1.24, -1.12, -2.36},
                {0.11124, -0.0, 0.11124},
                {-1.391, -1.567, -2.958},
                {-3.1, 1.0, -2.1},
                {1.1, 1.1, 2.2}
        };
    }

}
