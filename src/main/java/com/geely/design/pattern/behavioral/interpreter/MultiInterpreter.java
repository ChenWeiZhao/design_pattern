package com.geely.design.pattern.behavioral.interpreter;

/**
 * 乘法解释器
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    /**
     * @param firstExpression 乘数
     * @param secondExpression 被乘数
     */
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }

}
