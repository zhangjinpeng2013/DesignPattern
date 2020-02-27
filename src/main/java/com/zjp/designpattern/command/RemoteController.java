package com.zjp.designpattern.command;

public class RemoteController {
    //开 按钮的命令数组
    Command[] onCommands;
    //关 按钮的命令数组
    Command[] offCommands;

    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no) {
        //找到你按下的开的按钮,并调用对应的方法
        onCommands[no].execute();
        //记录这次的操作,用于撤销
        undoCommand = onCommands[no];
    }

    //按下关按钮
    public void offButtonWasPushed(int no) {
        //找到你按下的关的按钮,并调用对应的方法
        offCommands[no].execute();
        //记录这次的操作,用于撤销
        undoCommand = offCommands[no];
    }

    //撤销按钮按下
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
