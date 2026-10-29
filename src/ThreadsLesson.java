public class ThreadsLesson {
    void main() throws InterruptedException {
        // System.out.println(Thread.activeCount());

        // Thread.currentThread().setName("mainnnnnnnnnnnnnnnnnn");
        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(10);
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive());

        /*
         * 
         * for (int i = 3; i > 0; i--) {
         * System.out.println(i);
         * Thread.sleep(1000);
         * }
         * 
         * System.out.println("You are done!");
         */

        MyThread thread2 = new MyThread();
        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());
        thread2.start();

        // System.out.println(thread2.isAlive());

        // thread2.setName("second thread");
        // System.out.println(thread2.getName());

        // System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            if (this.isDaemon()) {
                System.out.println("This is a daemon thread that is running");
            } else {
                System.out.println("This a user thread that is running...");

            }
        }
    }
}
