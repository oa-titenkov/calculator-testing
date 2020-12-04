package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void isNegativeReturnsCorrectResponse(long a, boolean result) {
        Assert.assertEquals(calculator.isNegative(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, false},
                {0, false},
                {-1, true}
        };
    }

}
