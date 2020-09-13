package 设计模式;

public class Test {
    public static void main(String[] args) {
        Singleton01 singleton01=Singleton01.getSingleton01();
        Singleton01 singleton02=Singleton01.getSingleton01();
        Singleton02 a=Singleton02.getSingleton02();
        Singleton02 b=Singleton02.getSingleton02();
        System.out.println(singleton01==singleton02);
        System.out.println(a==b);
    }
}
