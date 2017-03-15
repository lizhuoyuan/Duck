package com.zy.li;

/**
 * Created by 卓原 on 2017/3/14.
 */
public class MallardDuck extends Duck {
    //绿头鸭

    public MallardDuck() {
        //使用flywithwings作为其flybehavior类型
        flyBehavior = new FlyBehavior.FlyWithWings();
        //绿头鸭使用Qucak类处理呱呱叫，所以当performQuack()被调用时，
        //叫的职责被委托给Qucak对象，而我们得到了真正的呱呱叫
        quackBehavior = new QuackBehavior.Quack();
    }

    @Override
    public void disply() {
        System.out.println("I'm a real Mallard duck");
    }
}
