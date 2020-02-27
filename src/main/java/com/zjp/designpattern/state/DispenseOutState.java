package com.zjp.designpattern.state;

//奖品发放完毕状态
public class DispenseOutState extends State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了,请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了,请下次再参加");
    }
}
