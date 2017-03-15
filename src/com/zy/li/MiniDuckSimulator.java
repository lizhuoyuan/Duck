package com.zy.li;

/**
 * Created by 卓原 on 2017/3/14.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
//这会调用MallardDuck继承而来的performQuack()方法，进而委托给该对象的QuackBehavior对象处理
        //也就是说，调用继承来的quackBeahvior引用对象的quack
        mallard.performQuack();
        mallard.performFly();

        //如果成功了，就意味模型鸭子可以动态的改变它的飞行行为。
        //如果把行为的实现类绑死在鸭子类中，就无法做到这样。
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
