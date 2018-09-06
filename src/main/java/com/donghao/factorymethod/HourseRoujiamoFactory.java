package com.donghao.factorymethod;

public class HourseRoujiamoFactory extends RoujiamoFactory {
    @Override
    public Roujiamo getRoujiamo() {
        return new HourseRoujiamo();
    }
}
