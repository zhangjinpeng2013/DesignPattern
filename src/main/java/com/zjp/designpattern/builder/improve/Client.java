package com.zjp.designpattern.builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        System.out.println("--------");

        houseDirector.setHouseBuilder(new HighHouse());
        houseDirector.constructHouse();
    }
}
