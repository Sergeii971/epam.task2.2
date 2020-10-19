package test.verbovskiy.task2.parser;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.parser.BaseParser;
import com.verbovskiy.task2.parser.impl.LexemeParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.verbovskiy.task2.data_provider.TextDataProvider;

import java.util.List;

import static org.testng.Assert.*;

public class LexemeParserTest {
    BaseParser parser;

    @BeforeClass
    public void setUp() {
        parser = new LexemeParser();
    }

    @Test
    public void parsePositiveTest() throws TaskException {
        List<TextComponent> parsedText = parser.parse(TextDataProvider.TEXT);
        int actual = parsedText.size();
        int expected = 129;
        assertEquals(actual, expected);
    }

    @Test
    public void parseNegativeTest() throws TaskException {
        List<TextComponent> parsedText = parser.parse(TextDataProvider.TEXT);
        int actual = parsedText.size();
        int expected = 100;
        assertNotEquals(actual, expected);
    }
}