package 设计模式;

public class Singleton02 {
    private static Singleton02 singleton02;
    private Singleton02(){}

    public static Singleton02 getSingleton02()
    {
        if(singleton02==null)
        {
            System.out.println("创建实例");
            singleton02=new Singleton02();
        }
        else System.out.println("已经创建，直接使用！");
        return singleton02;
    }
}
