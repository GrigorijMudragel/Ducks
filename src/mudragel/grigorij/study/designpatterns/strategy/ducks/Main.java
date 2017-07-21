package mudragel.grigorij.study.designpatterns.strategy.ducks;

import mudragel.grigorij.study.designpatterns.strategy.ducks.interfaces.FlyRockedPowered;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck ();
        mallard.performQuack();
        mallard. performFly ();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();

    }
}
