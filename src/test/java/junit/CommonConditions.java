package junit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class CommonConditions {

    protected static Calculator calculator;

    @BeforeClass
    public static void setCalculator() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void clearCalculator() {
        calculator = null;
    }
}

