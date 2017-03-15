package com.zy.li;

/**
 * Created by 卓原 on 2017/3/14.
 */
public interface FlyBehavior {
    public void fly();

    /*
    *飞行行为的实现，给“真会”飞的鸭子用
    * */
    public class FlyWithWings implements FlyBehavior {

        @Override
        public void fly() {
            System.out.println("I'm flying");
        }
    }

    /*
   *飞行行为的实现，给“不会”飞的鸭子用
   * */
    public class FlyNoway implements FlyBehavior {

        @Override
        public void fly() {
            System.out.println("I can't fly");
        }
    }
}
