package adapter;

public class FlyDog implements Dog {

    private final Bird bird;

    /**
     * 构造函数，需要适配的接口
     * @param bird
     */
    public FlyDog(Bird bird) {
        this.bird = bird;
    }


    public void eat() {
        System.out.println("flyDog eat");
    }

    /**
     * 适配的方法
     */
    public void fly(){
        bird.fly();
    }
}
