package com.zjp.designpattern.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //操作电灯的按钮
        //需要一个遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);

        System.out.println("----操作电视机----");

        //操作电视机的命令
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();
    }
}
