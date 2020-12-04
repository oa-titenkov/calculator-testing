package junit;

import org.junit.Assert;
import org.junit.Test;

public class sumTest extends CommonConditions {

    @Test
    public void sumOfLongNumbersIsCorrect() {
        Assert.assertEquals(3, calculator.sum(1, 2));
    }
}
