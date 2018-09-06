package com.donghao.factorymethod;

public class DogRoujiamoFactory extends RoujiamoFactory {

    @Override
    public Roujiamo getRoujiamo() {
        return new DogRoujiamo();
    }
}
