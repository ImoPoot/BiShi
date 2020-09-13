package 线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CreateThreads {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new ArrayBlockingQueue<>(5);

        Thread t=new Thread(){
            @Override
            public void run() {
                System.out.println("hahaha");
            }
        };
        t.start();
        Runnable r=()->{
            System.out.println("dididi");
        };

        Thread t2=new Thread(r);
        t2.start();
    }
}
