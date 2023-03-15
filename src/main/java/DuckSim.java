import TypeOfDuck.Duck;
import TypeOfDuck.MallardDuck;

public class DuckSim {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck("Кряква");
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

    }
}
