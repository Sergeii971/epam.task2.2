package com.verbovskiy.task2.interpreter;

import com.verbovskiy.task2.exception.TaskException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ArithmeticInterpreter {
    private final String SHORT_NAME = "JavaScript";

    public String interpretExpression(String text) throws TaskException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName(SHORT_NAME);
        try {
            return engine.eval(text).toString();
        } catch (ScriptException e) {
            throw new TaskException(e);
        }
    }
}
