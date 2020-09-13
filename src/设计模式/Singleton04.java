package 设计模式;

public class Singleton04 {
    private static class SingletonOnholder{
        private static final Singleton04 Instance=new Singleton04();
    }
    private Singleton04(){}

    public static Singleton04 getInstance(){
        return SingletonOnholder.Instance;
    }
}
