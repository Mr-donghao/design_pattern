package com.donghao.creational.builder;

/**
 * 抽象的builder类。
 */
public abstract class Builder {

    public abstract void buildCPU();
    public abstract void buildMainboard();
    public abstract void buildHD();
    public abstract Computer getComputer();

}
