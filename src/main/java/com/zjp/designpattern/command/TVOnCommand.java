package com.zjp.designpattern.command;

public class TVOnCommand implements Command {
    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    public void execute() {
        tvReceiver.on();
    }

    public void undo() {
        tvReceiver.off();
    }
}
