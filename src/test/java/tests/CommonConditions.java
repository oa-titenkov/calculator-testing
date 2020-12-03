package tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonConditions {

    protected Calculator calculator;

    @BeforeSuite(alwaysRun = true)
    public void setCalculator() {
        calculator = new Calculator();
    }

    @AfterSuite(alwaysRun = true)
    public void clearCalculator() {
        calculator = null;
    }
}
