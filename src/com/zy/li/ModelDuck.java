package com.zy.li;

/**
 * Created by 卓原 on 2017/3/14.
 */
public class ModelDuck extends Duck {
    //模型鸭子

    public ModelDuck() {
        flyBehavior = new FlyBehavior.FlyNoway();//一开始我们的模型鸭子是不会飞的
        quackBehavior = new QuackBehavior.Quack();
    }

    @Override
    public void disply() {
        System.out.println("I'm a model duck ");
    }
}
