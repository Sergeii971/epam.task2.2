package com.verbovskiy.task2.parser;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.exception.TaskException;

import java.util.List;

public interface BaseParser {
    List<TextComponent> parse(String textComponent) throws TaskException;
}
