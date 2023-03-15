package quackBehavior;

public class DoNotQuack implements IQuack{
    @Override
    public void quack() {
        System.out.println("молчит");
    }
}
