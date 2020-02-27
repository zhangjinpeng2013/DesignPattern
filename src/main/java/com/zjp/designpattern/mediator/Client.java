package com.zjp.designpattern.mediator;

public class Client {
    public static void main(String[] args) {
        //创造一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm并加入到ConcreteMediator对象的HashMap中
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建coffeeMachine,并加入到ConcreteMediator的HashMap中
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建Curtains并加入到ConcreteMediator对象的HashMap中
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
