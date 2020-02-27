package com.zjp.designpattern.state;

//不能抽奖状态
public class NoRaffleState extends State {

    //初始化时传入活动引用,扣除积分后改变状态
    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    //当前状态是可以扣积分状态,扣除后,将状态设置成可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功,您可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖啊");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("当前状态不能发放奖品");
    }
}
