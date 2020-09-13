package 线程;

import javax.swing.*;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable{
    private String name;
    public MyRunnable(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+"开始执行任务,开始时间："+new Date());
        work();
        System.out.println(name+"任务执行结束,开结束时间："+new Date());

    }
    private void work()
    {
        try {
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class ThreadPoolExecutorDemo {
    private static final int core_pool_size=5;
    private static final int max_pool_size=10;
    private static final int queue_capacity=100;
    private static final long keep_alive=1L;
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                core_pool_size,
                max_pool_size,
                keep_alive,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(queue_capacity),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        for(int i=0;i<20;i++)
        {
            Runnable r=new MyRunnable("Thread"+i);

            executor.execute(r);
        }
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("所有线程执行结束");
    }
}
