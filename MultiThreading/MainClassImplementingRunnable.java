package MultiThreading;
/*
    this is a class which implements the runnable interface, and
    this class's instance should be passed in the constructor of the Thread class
    and that thread class's instance should call the start method.

    ** NOTE: The Runnable interface is a functional interface @FunctionalInterface
    which meant it has only one abstract method which can be used as a lambda function  as demonstrated in the
    main class**
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

    }
}
