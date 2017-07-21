package mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces;

/**
 * Created by Grigorij_Mudragel on 7/19/2017.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}