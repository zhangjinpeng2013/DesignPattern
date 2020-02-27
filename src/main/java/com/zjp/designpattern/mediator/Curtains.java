package com.zjp.designpattern.mediator;

public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }

    public void upCurtains() {
        System.out.println("升起幕布");
    }
}
