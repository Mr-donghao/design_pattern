package com.donghao.builder;

public class ConcreteBuilder extends Builder {

    //创建产品实例
    Computer computer = new Computer();

    @Override
    public void buildCPU() {

        computer.Add("CPU");
    }

    @Override
    public void buildMainboard() {

        computer.Add("Mainboard");
    }

    @Override
    public void buildHD() {

        computer.Add("HD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
