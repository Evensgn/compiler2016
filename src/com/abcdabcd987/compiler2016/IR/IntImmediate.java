package com.abcdabcd987.compiler2016.IR;

/**
 * Created by abcdabcd987 on 2016-04-07.
 */
public class IntImmediate extends IRNode implements IntValue {
    private int value;
    private int size;

    public IntImmediate(int size, int value) {
        this.size = size;
        this.value = value;
    }

    @Override
    public void accept(IIRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRNode getIRNode() {
        return this;
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getValue() {
        return value;
    }
}
