package com.donghao.factorymethod;


//工厂方法父类，制定规范，不负责具体制定返回哪些类的实体
//有该累的子类具体指定返回哪些类的实体
public abstract class RoujiamoFactory {

    public abstract Roujiamo getRoujiamo();
}
