package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonConditions {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setCalculator() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void clearCalculator() {
        calculator = null;
    }
}
