package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tgTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void tanOfNumberIsCorrect(double a, double result) {
        Assert.assertEquals(calculator.tg(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 1.5574077246549023},
                {10, 0.6483608274590866},
                {4, 1.1578212823495777},
                {-1.24, -2.911929861155226},
        };
    }

}
