package com.zjp.designpattern.command;

public class LightOffCommand implements Command {
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.off();
    }

    public void undo() {
        lightReceiver.on();
    }
}
