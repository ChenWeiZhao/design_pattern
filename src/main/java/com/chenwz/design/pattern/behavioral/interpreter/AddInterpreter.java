package com.chenwz.design.pattern.behavioral.interpreter;

/**
 * 加法解释器
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    /**
     * @param firstExpression  加数
     * @param secondExpression 被加数
     */
    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
