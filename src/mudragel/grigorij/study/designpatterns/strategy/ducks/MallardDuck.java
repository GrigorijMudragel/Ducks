package mudragel.grigorij.study.designpatterns.strategy.ducks;

import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.FlyWithWings;
import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.Quack;

/**
 * Created by Grigorij_Mudragel on 7/19/2017.
 */
public class MallardDuck extends Duck {


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm а real Mallard duck");
    }
}