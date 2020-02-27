package com.zjp.designpattern.mediator;

import java.util.HashMap;

//具体中介者类
public class ConcreteMediator extends Mediator {
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    //具体中介者的核心方法
    //根据得到的消息,完成对应的任务
    //中介者在这个方法,协调各个具体的同时对象,完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                //煮咖啡
                ((CoffeeMachine) colleagueHashMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                //开电视
                ((TV) colleagueHashMap.get(interMap.get("TV"))).startTV();
            } else if (stateChange == 1) {
                //关闭电视
                ((TV) colleagueHashMap.get(interMap.get("TV"))).stopTV();
            }
        } else if (colleagueHashMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) colleagueHashMap.get(interMap.get("Curtains"))).upCurtains();
        } else if (colleagueHashMap.get(colleagueName) instanceof TV) {
        } else if (colleagueHashMap.get(colleagueName) instanceof Curtains) {
        }
    }

    @Override
    public void sendMessage() {

    }
}
