package 携程2019;

import java.util.LinkedList;
import java.util.List;

class A {
    public int a = 0;
    public void fun(){
        System.out.println("A");
    }
}

public class B extends A {
    public int a = 1;

    public void fun() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        A classA = new B();
        System.out.println(classA.a);
        classA.fun();
    }
}