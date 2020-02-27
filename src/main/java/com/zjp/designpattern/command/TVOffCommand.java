package com.zjp.designpattern.command;

public class TVOffCommand implements Command {
    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    public void execute() {
        tvReceiver.off();
    }

    public void undo() {
        tvReceiver.on();
    }
}
