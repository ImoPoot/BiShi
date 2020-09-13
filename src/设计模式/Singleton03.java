package 设计模式;

public class Singleton03 {
    volatile private static  Singleton03 singleton03;
    public static Singleton03 getSingleton02()
    {
        if(singleton03==null){
            synchronized (Singleton03.class){
                if(singleton03==null)
                {
                    System.out.println("创建实例");
                    singleton03=new Singleton03();
                }
            }
        }
        //else System.out.println("已经创建，直接使用！");
        return singleton03;
    }
}
