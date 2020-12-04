package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void cosOfNumberIsCorrect(double a, double result) {
        Assert.assertEquals(calculator.cos(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 0.5403023058681398},
                {10, -0.8390715290764524},
                {4, -0.6536436208636119},
                {-1.24, 0.32479628443877623},
        };
    }

}

