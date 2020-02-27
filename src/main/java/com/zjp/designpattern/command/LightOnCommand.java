package com.zjp.designpattern.command;

public class LightOnCommand implements Command {
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        //调用接受者的方法
        lightReceiver.on();
    }

    public void undo() {
        //调用接受者的方法
        lightReceiver.off();
    }
}
