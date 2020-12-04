package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTest extends CommonConditions {

    @Test(dataProvider = "dataLong")
    public void multiplicationOfLongNumbersIsCorrect(long a, long b, long result) {
        Assert.assertEquals(calculator.mult(a, b), result);
    }

    @Test(dataProvider = "dataDouble", groups = "doubleDataGroup")
    public void multiplicationOfDoubleNumbersIsCorrect(double a, double b, double result) {
        Assert.assertEquals(calculator.mult(a, b), result);
    }

    @DataProvider(name = "dataLong", parallel = true)
    public Object[][] dataLongProvider() {
        return new Object[][]{
                {1, 1, 1},
                {-1, -1, 1},
                {0, 0, 0},
                {-1, 5, -5},
                {22222222L, -22222222L, -493827150617284L},
                {Long.MAX_VALUE, 1, Long.MAX_VALUE},
        };
    }

    @DataProvider(name = "dataDouble", parallel = true)
    public Object[][] dataDoubleProvider() {
        return new Object[][]{
                {1.1, -1.1, -1.1},
                {-1.24, 1.12, -1.3888},
                {0.11124, 0.0, 0},
                {-1.391, 1.567, -1.7849697},
                {-3.1, -1.0, -3.1},
                {1.1, -1.1, -1.1}
        };
    }

}
