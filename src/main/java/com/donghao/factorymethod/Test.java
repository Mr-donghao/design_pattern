package com.donghao.factorymethod;

public class Test {

    public static void main(String[] args) {

        RoujiamoFactory roujiamoFactory = new DogRoujiamoFactory();
        RoujiamoFactory roujiamoFactory1 = new HourseRoujiamoFactory();
        Roujiamo roujiamo = roujiamoFactory.getRoujiamo();
        roujiamo.produce();

    }
}
