package com.donghao.simplefactory;

public class Test {

    public static void main(String[] args) {

    RoujiamoFactory roujiamoFactory = new RoujiamoFactory();
    Roujiamo roujiamo = roujiamoFactory.getRoujiamo("dog");
    roujiamo.produce();
    
    }
}
