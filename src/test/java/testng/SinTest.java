package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void sinOfNumberIsCorrect(double a, double result) {
        Assert.assertEquals(calculator.sin(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 0.8414709848078965},
                {10, -0.5440211108893698},
                {4, -0.7568024953079282},
                {-1.24, -0.945783999449539},
        };
    }

}
