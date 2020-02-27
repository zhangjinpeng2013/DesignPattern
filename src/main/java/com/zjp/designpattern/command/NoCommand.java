package com.zjp.designpattern.command;

//没有任何命令,即空执行:用于初始化每个按钮,当调用命令时,对象什么也不做
//其实,这也是一种设计模式,可以省掉对空判断
public class NoCommand implements Command {
    public void execute() {

    }

    public void undo() {

    }
}
