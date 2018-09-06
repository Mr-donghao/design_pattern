package com.donghao.factorymethod;

/**
 * Created by geely
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
