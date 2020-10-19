package test.verbovskiy.task2.parser;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.parser.BaseParser;
import com.verbovskiy.task2.parser.impl.ParagraphParser;
import com.verbovskiy.task2.parser.impl.SentenceParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.verbovskiy.task2.data_provider.TextDataProvider;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SentenceParserTest {
    BaseParser parser;

    @BeforeClass
    public void setUp() {
        parser = new SentenceParser();
    }

    @Test
    public void parsePositiveTest() throws TaskException {
        List<TextComponent> parsedText = parser.parse(TextDataProvider.TEXT);
        int actual = parsedText.size();
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void parseNegativeTest() throws TaskException {
        List<TextComponent> parsedText = parser.parse(TextDataProvider.TEXT);
        int actual = parsedText.size();
        int expected = 3;
        assertNotEquals(actual, expected);
    }
}