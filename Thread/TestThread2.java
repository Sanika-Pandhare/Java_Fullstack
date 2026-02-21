class Thread3 implements Runnable{
    //override
    public void run()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}class Thread4 implements Runnable{
    //override
    public void run()
    {
        for(int i=11; i<=20; i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}public class TestThread2 {
    public static void main(String[] args) throws InterruptedException {

        Thread3 t1 = new Thread3();
        Thread tt2 = new Thread(t1);
        tt2.start();
        tt2.join();  
        Thread4 t2 = new Thread4();
        Thread ttt3 = new Thread(t2);
        ttt3.start();
    }
}
