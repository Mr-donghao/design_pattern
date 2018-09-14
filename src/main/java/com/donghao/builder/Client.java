package com.donghao.builder;

/**
 * 客户端调用 找电脑店老板买电脑
 */
public class Client {

    public static void main(String[] args) {

        //找到老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        //老板找人
        director.Construct(builder);

        //builder组装好电脑
        Computer computer = builder.getComputer();

        computer.Show();
    }
}
