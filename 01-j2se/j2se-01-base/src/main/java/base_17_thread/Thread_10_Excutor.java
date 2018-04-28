package base_17_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Thread_10_Excutor implements Runnable {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(new Thread_10_Excutor(), 1, 1, TimeUnit.MINUTES);
    }

    @Override
    public void run() {
        System.out.println("excutor test");
    }
}
