package com.verbovskiy.task2.composite.impl;

import com.verbovskiy.task2.composite.TextComponent;
import com.verbovskiy.task2.composite.ComponentType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> textComponents;
    private ComponentType type;

    public TextComposite(ComponentType type) {
        this.textComponents = new ArrayList<>();
        this.type = type;
    }

    @Override
    public void add(TextComponent textComponent) {
        textComponents.add(textComponent);
    }

    @Override
    public void remove(TextComponent textComponent) {
        textComponents.remove(textComponent);
    }

    @Override
    public List<TextComponent> getChildren() {
        return Collections.unmodifiableList(textComponents);
    }

    public ComponentType getType() {
        return type;
    }

    @Override
    public int size() {
        return textComponents.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextComposite textComposite = (TextComposite) o;

        if (textComponents == null) {
            if (textComposite.textComponents != null) {
                return false;
            }
        } else {
            if (!textComponents.equals(textComposite.textComponents)) {
                return false;
            }
        }
        if (type == null) {
            if (textComposite.type != null) {
                return false;
            }
        } else {
            if (!type.equals(textComposite.type)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + textComponents.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TextComponent textComponent : textComponents) {
            sb.append(textComponent.toString());
        }
        return sb.toString();
    }
}
