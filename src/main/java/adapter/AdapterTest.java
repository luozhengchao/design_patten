package adapter;

/**
 * 适配器模式：适配两个不相关的接口
 */
public class AdapterTest {

    public static void main(String[] args) {
        FlyDog flyDog = new FlyDog(new YellowBird());
        flyDog.eat();
        flyDog.fly();
    }
}
