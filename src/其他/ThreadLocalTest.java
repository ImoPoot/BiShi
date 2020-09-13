package 其他;

public class ThreadLocalTest {
    public static final ThreadLocal<String> local=new ThreadLocal<>(){
        @Override
        protected String initialValue() {
            System.out.println("进行初始化");
            return null;
        }
    };

    public static void main(String[] args) {
            Thread t1=new Thread(new ThreadTask("task1"));
            Thread t2=new Thread(new ThreadTask("task2"));
            t1.start();
            t2.start();
    }
}

class ThreadTask implements Runnable{
    private String name;
    public ThreadTask(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {
        if(ThreadLocalTest.local.get()==null)
        {
            ThreadLocalTest.local.set("zhang");
            System.out.println(name+ThreadLocalTest.local.get());
        }
        else {
            ThreadLocalTest.local.set("shang");
            System.out.println(name+ThreadLocalTest.local.get());
        }
    }
}

