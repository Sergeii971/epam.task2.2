package test.verbovskiy.task2.interpreter;

import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.interpreter.ArithmeticInterpreter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticInterpreterTest {
    ArithmeticInterpreter interpreter;

    @BeforeClass
    public void setUp() {
        interpreter = new ArithmeticInterpreter();
    }

    @Test
    public void interpretExpressionPositiveTest() throws TaskException {
        String actual = interpreter.interpretExpression("5+3");
        String expected = "8";
        assertEquals(actual, expected);
    }

    @Test
    public void interpretExpressionNegativeTest() throws TaskException {
        String actual = interpreter.interpretExpression("5+3");
        String expected = "6";
        assertNotEquals(actual, expected);
    }
}