package com.verbovskiy.task2.composite;

import com.verbovskiy.task2.exception.TaskException;

import java.util.List;

public interface TextComponent {
    void add(TextComponent textComponent);

    void remove(TextComponent textComponent);

    List<TextComponent> getChildren();

    int size();
}
