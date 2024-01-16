package MultiThreading;

/*
    this is a class which implements the runnable interface
 */

class RunnableThread2 implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100 ; i++){
            System.out.println("Hello this is thread 2 running now : Thread 2");
        }
    }
}

public class MainClassImplementingRunnable {
    public static void main(String[] args) {
       Runnable runnableThread1 = () -> {
               for(int i = 0; i < 100; i++) {
                   System.out.println("Hello, this is thread 1 running now : Thread 1");
               }
       };

       Runnable runnableThread2 = new RunnableThread2();

       Thread thread1 = new Thread(runnableThread1);
       Thread thread2 = new Thread(runnableThread2);

       thread1.start();
       thread2.start();

//        runnableThread1
//        runnableThread2.run();


    }
}
