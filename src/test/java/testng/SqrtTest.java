package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class SqrtTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void squareRootIsCorrect(double a, double result) {
        Assert.assertEquals(calculator.sqrt(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 1},
                {10, 3.1622776601683795},
                {4, 2},
                {-1.24, NaN},
        };
    }

}
