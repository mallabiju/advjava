package N_Threads;

class ThreadOne extends Thread {
    public void run() {
        System.out.println("Thread One");
        System.out.println("Execution of i in Thread One");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of thread one.");
    }
}

class ThreadTwo extends Thread {
    public void run() {
        System.out.println("Thread Two");
        System.out.println("Execution of i in Thread Two");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("End of thread two.");
    }
}

public class g_threads_multithreads {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();

        Thread.yield();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("End of main thread.");
    }
}
