package TypeOfDuck;

import flyBehavior.Fly;
import quackBehavior.Quack;
import quackBehavior.Squeak;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);

    }
    Quack quack = new Quack();
    Fly fly = new Fly();

    public void display(){
        System.out.println(name);
    }
}
