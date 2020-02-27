package com.zjp.designpattern.state;

import java.util.Random;

//可抽奖的状态
public class CanRaffleState extends State {
    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    //已经扣除了积分，不能再扣
    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分了");
    }

    //可以抽奖，抽奖完后，根据实际情况，改成新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖。请稍等");
        Random random = new Random();
        int num = random.nextInt(10);
        //10%中奖机会
        if (num == 0) {
            //改变状态为发放奖品
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品");
            //改变状态为不能抽奖状态
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    //不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖,不能发放奖品");
    }
}
