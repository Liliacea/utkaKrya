package TypeOfDuck;

import flyBehavior.Fly;
import flyBehavior.IFly;
import org.w3c.dom.ls.LSOutput;
import quackBehavior.IQuack;
import quackBehavior.Quack;

public abstract class Duck {
    public IFly fly = new Fly();
    public IQuack quack = new Quack();
    public String name;

    public Duck(String name) {

        this.name = name;
    }
    public abstract void display();
    public void performFly(){
        fly.fly();
    }
    public void performQuack(){
        quack.quack();
    }
    public void swim(){
        System.out.println("плавает");
    }

}
