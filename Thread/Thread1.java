// Thread in java -> support whole system use of thread
// virtual Thread since jdk 19 and JDK 21

// Thread Depends only OS,but virtual Thread is not depend OS
// What is difference between GET,POST


// When we run a java code with main method
// minimum two thread will be started
// 1.main thread to execute the code
// it will start from main method
// but if we have static {} block it will start from the first
// static block ,as we may have more than one unnamed static
// block in a java code.
// 2.low priority thread will be created for grabage collection.

// o code thread we have only two option
// 1.extending thread -not good practice
// 2.implementing Reunnable interface -good option
// 3.using the eXecutor framework
// 4.lambda thread
// 5.virtual thread from jdk21
// (more light weight)

class Thread1 extends Thread{

    //override
    public void run()
    {
        System.out.println(Thread .currentThread().getName()+":in :main:");
        System.out.println(Thread .currentThread().getPriority());
    }

    public static void main(String[] args)
    {
      System.out.println(Thread .currentThread().getName()+"in main:");
        System.out.println(Thread .currentThread().getPriority());  
        Thread1 t1=new Thread1();
        Thread1 t2=new Thread1();

        t1.start();
        t2.start();
    }
}

