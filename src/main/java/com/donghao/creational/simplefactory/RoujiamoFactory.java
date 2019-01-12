package com.donghao.creational.simplefactory;

public class RoujiamoFactory {

    public Roujiamo getRoujiamo(Class c) {
        Roujiamo roujiamo = null;
        try {
            roujiamo = (Roujiamo) c.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return roujiamo;
    }


    public Roujiamo getRoujiamo(String type){
        if("dog".equalsIgnoreCase(type)){
            return new DogRoujiamo();
        }else  if("hourse".equalsIgnoreCase(type)){
            return new HourseRoujiamo();
        }

        return  null;
    }
}
