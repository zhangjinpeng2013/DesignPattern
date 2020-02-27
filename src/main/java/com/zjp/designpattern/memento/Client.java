package com.zjp.designpattern.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1 攻击力 100");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#2 攻击力 80");

        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#3 攻击力 60");

        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是:" + originator.getState());

        //希望得到占状态2

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("恢复到的状态2:" + originator.getState());
    }
}
