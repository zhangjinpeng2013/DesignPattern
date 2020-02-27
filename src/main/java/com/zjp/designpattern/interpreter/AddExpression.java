package com.zjp.designpattern.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbalExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
