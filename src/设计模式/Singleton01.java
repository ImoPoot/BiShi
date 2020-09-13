package 设计模式;

public class Singleton01 {
    private static Singleton01 singleton01 =new Singleton01();
    private Singleton01(){}

    public static Singleton01 getSingleton01() {
        return singleton01;
    }
}
