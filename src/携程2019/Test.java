package 携程2019;

 class Parent {
    int x=5;
    public static int age=23;
    public static void eat(){
        System.out.println("parent ead");
    }
    public void say()
    {
        System.out.println("parent");
    }
}

class Son extends  Parent{
    int x=10;
    public static int age=99;

    @Override
    public void say() {
        System.out.println("son");
    }

    public static void eat(){
        System.out.println("son eat");
    }
}
public class Test{
    public static void main(String[] args) {
        Parent p=new Parent();
        Parent son=new Son();
        Son realSon=new Son();
        System.out.println(son.x);
        System.out.println(realSon.x);
        System.out.println(p.age);
        System.out.println(son.age);
        System.out.println(realSon.age);
        son.say();
        realSon.say();
        p.eat();
        son.eat();
        realSon.eat();
    }
}