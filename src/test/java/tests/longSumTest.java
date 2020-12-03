package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class longSumTest extends CommonConditions {

    @Test(dataProvider = "data")
    public void sumOfTwoLongNumbersIsCorrect(long a, long b, long result) {
        final Thread thread = Thread.currentThread();
        System.out.printf("#%d %s: %s : %s", thread.getId(), thread.getName(), a, b);
        Assert.assertEquals(calculator.sum(a, b), result);
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, 1, 2},
                {-1, -1, -2},
                {0, 0, 0},
                {22222222L, 22222222L, 44444444L},
                {-1, -1, -2},
                {-1, -1, -2},
                {1, 0b10100, 21}
        };
    }

}
