package com.zjp.designpattern.iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Colleage> colleages = new ArrayList<Colleage>();
        ComputerColleage computerColleage = new ComputerColleage();
        InfoColleage infoColleage = new InfoColleage();

        colleages.add(computerColleage);
        colleages.add(infoColleage);

        OutPutImpl outPut = new OutPutImpl(colleages);
        outPut.printCollege();
    }
}
