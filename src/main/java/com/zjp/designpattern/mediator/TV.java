package com.zjp.designpattern.mediator;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("打开电视");
    }

    public void stopTV() {
        System.out.println("关闭电视");
    }
}
