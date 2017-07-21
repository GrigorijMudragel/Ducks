package mudragel.grigorij.study.designpatterns.strategy.ducks;

import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.FlyBehavior;
import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.QuackBehavior;

/**
 * Created by Grigorij_Mudragel on 7/19/2017.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}