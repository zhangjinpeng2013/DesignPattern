package com.zjp.designpattern.interpreter;

import java.util.HashMap;

public class SymbalExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
