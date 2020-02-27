package com.zjp.designpattern.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Cloneable, Serializable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    //深拷贝实现方式一：使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        //对引用类型的数据单独处理
        DeepCloneableTarget deepCloneableTarget = deepProtoType.deepCloneableTarget;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    //深拷贝实现方式二：通过对象的序列化方法实现
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deep = (DeepProtoType) ois.readObject();
            return deep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
