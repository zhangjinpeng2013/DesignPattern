package com.zjp.designpattern.template.improve;

public class PureSoyaMilk extends SoyaMilk {

    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
