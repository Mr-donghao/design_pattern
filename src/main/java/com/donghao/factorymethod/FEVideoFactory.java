package com.donghao.factorymethod;

/**
 * Created by geely
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {

        return new FEVideo();
    }
}