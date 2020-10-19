package com.verbovskiy.task2.parser.impl;

import com.verbovskiy.task2.composite.ComponentType;
import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.impl.TextComposite;
import com.verbovskiy.task2.exception.TaskException;
import com.verbovskiy.task2.interpreter.ArithmeticInterpreter;
import com.verbovskiy.task2.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LexemeParser implements BaseParser {
    private final String REGEX_EXPRESSION = "\\p{N}+";
    private final String LEXEME_REGEX = "[\\n]|[\\t]|[ ]";
    private final BaseParser nextParser = new CharacterParser();

    @Override
    public List<TextComponent> parse(String textComponent) throws TaskException {
        List<TextComponent> componentLexemes = new ArrayList<>();
        String[] lexemes = textComponent.split(LEXEME_REGEX);
        Pattern pattern = Pattern.compile(REGEX_EXPRESSION);

        for (String lexeme : lexemes) {
            if (pattern.matcher(lexeme).find()) {
                lexeme = calculateArithmeticExpression(lexeme);
            }
            TextComponent componentLexeme = new TextComposite(ComponentType.LEXEME);
            List<TextComponent> componentCharacters = nextParser.parse(lexeme);
            for (TextComponent componentCharacter : componentCharacters) {
                componentLexeme.add(componentCharacter);
            }
            componentLexemes.add(componentLexeme);
        }
        return componentLexemes;
    }

    private String calculateArithmeticExpression(String textComponent) throws TaskException {
        ArithmeticInterpreter interpreter = new ArithmeticInterpreter();
         return interpreter.interpretExpression(textComponent);
    }
}
