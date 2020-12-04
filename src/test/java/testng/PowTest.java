package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void exponentiationIsCorrect(double a, double b, double result) {
        Assert.assertEquals(calculator.pow(a, b), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 1, 1},
                {10, 0, 1},
                {-2, 2, 4},
                {2, 3, 8},
                {1.24, 2.11, 1.5744169464225444},
        };
    }

}
