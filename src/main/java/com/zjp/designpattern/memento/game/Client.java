package com.zjp.designpattern.memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和boos大战前的状态");
        gameRole.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战");
        gameRole.setVit(80);
        gameRole.setDef(80);

        gameRole.display();

        System.out.println("大战后,使用备忘录模式恢复到战前状态");

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());

        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
