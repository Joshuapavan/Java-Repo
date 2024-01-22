package MultiThreading;

/*
    Suppose we are working with 2 threads, and they are modifying (altering) a single variable which is mutable.
    we might face some issues with the data being inconsistent, as the threads run in parallel.

    Hence, we have to apply thread safety.
    which means only one thread can work on a mutable variable at a given time.
 */
public class ThreadSafety {
    class Counter{
        int count;

        public void increaseCountByOne(){
            count++;
        }
    }

    Runnable runnable1 = () ->{
        for(int i = 0; i < 1000 ; i++){

        }
    };
}

