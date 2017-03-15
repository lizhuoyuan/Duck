package com.zy.li;

/**
 * Created by 卓原 on 2017/3/14.
 */
public interface QuackBehavior {
    public void quack();

    public class Quack implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("Qucak");
        }
    }

    public class MuteQuack implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("<<Silence>>");
        }
    }

    public class Squeak implements QuackBehavior {
        @Override
        public void quack() {
            System.out.println("Squeak");
        }
    }
}
