package MultiThreading;

/*
   We can implement multi threading by extending the threads class or by implementing the Runnable interface
   We will have to override the run method
 */
class Thread1 extends Thread{

    @Override
    public void run(){
        for(int i=0 ; i < 100; i++ ){
            System.out.println("Hello This is thread 1 running now : Thread 1");
        }
    }
}

class Thread2 extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 100 ; i++){
            System.out.println("Hello this is thread 2 running now : Thread 2");
        }
    }
}

public class MainClassExendingThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();  // we have to use start method to start the thread
        thread2.start();

    }
}