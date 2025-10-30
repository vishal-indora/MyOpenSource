package ConcurrencyProblems;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * <a href="https://leetcode.com/problems/print-zero-even-odd/description/">...</a>
 *
 */
class ZeroEvenOdd {
    private int n;
    private Semaphore semaphoreZ;
    private Semaphore semaphoreE;
    private Semaphore semaphoreO;
    private boolean flag;
    private int x;

    public ZeroEvenOdd(int n) {
        this.n = n;
        this.x = 1;
        semaphoreZ = new Semaphore(1);
        semaphoreE = new Semaphore(1);
        semaphoreO = new Semaphore(1);
        try{
            semaphoreE.acquire();
            semaphoreO.acquire();
        } catch (InterruptedException ex){

        }

        flag = true;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        try {
            semaphoreZ.acquire();
            printNumber.accept(0);
            if(flag) {
                semaphoreO.release();
            } else {
                semaphoreE.release();
            }
        } finally {
            //semaphoreZ.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        semaphoreE.acquire();
        if(x<n) printNumber.accept(x);
        else return;
        x++;
        semaphoreZ.release();
        flag = !flag;
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        semaphoreO.acquire();
        if(x<n) printNumber.accept(x);
        else return;
        x++;
        semaphoreZ.release();
        flag = !flag;
    }
}
