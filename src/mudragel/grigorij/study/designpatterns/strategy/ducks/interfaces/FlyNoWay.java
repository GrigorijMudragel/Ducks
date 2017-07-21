package mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces;

/**
 * Created by Grigorij_Mudragel on 7/19/2017.
 */
public class FlyNoWay implements FlyBehavior{
        public void fly() {
            System.out.println("I can't fly");
        }
}