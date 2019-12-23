package com.chenwz.design.pattern.behavioral.interpreter;

/**
 * Created by geely.
 */
public class OperatorUtil {
    /**
     * 判断是否是可操作符
     */
    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("*"));

    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
