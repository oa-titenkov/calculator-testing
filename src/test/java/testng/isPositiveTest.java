package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isPositiveTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void isPositiveReturnsCorrectResponse(long a, boolean result) {
        Assert.assertEquals(calculator.isPositive(a), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, true},
                {0, false},
                {-1, false}
        };
    }

}
