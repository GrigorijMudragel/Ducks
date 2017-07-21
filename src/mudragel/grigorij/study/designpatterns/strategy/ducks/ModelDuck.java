package mudragel.grigorij.study.designpatterns.strategy.ducks;

import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.FlyNoWay;
import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.Quack;

/**
 * Created by Grigorij_Mudragel on 7/19/2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay() ;
        quackBehavior = new Quack() ;
    }

    public void display(){
        System.out.println(" I am model duck");
    }
}
