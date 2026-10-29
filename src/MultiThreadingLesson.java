public class MultiThreadingLesson {
    void main() throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join(3000);
        thread2.start();
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread #1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("THread #1 is finished :)");
        }
    }

    private class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread #2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("THread #2 is finished :)");

        }
    }
}
