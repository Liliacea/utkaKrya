package flyBehavior;

import flyBehavior.IFly;

public class DoNotFly implements IFly {
    @Override
    public void fly() {
        System.out.println("Не летает");
    }
}
