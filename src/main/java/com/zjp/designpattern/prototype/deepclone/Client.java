package com.zjp.designpattern.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "张金鹏";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("测试克隆", "测试");

        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();

        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.deepCloneableTarget.hashCode() + "||" + deepProtoType2.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType.deepCloneableTarget.hashCode() + "||" + deepProtoType3.deepCloneableTarget.hashCode());
    }
}
