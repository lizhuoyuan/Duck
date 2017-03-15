package com.zy.li;

/**
 * Created by 卓原 on 2017/3/14.
 */

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void disply();

    public void performFly() {
        //委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        //委托给行为类
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all ducks float,even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
