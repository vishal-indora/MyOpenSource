package ConcurrencyProblems;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> accessResource("t1"));
    }

    static class task implements Runnable{
        private final String thread;

        task(String thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            accessResource(thread);
            accessResource2(thread);
        }
    }

    private static void accessResource(String threadName) {
        System.out.println("Inside access class");
    }

    private static void accessResource2(String threadName) {
        System.out.println("Inside access class2");
    }
}
