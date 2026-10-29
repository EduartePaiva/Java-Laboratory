import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskLesson {
    // Timer =A facility for threads to schedule tasks for future execution in a
    // background thread

    // TimerTask = A task that can be scheduled for one-time or repeated execution
    // by a Timer

    void main() {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {

                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("Happy new year!!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2020);
        date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH, 20);

        // timer.schedule(task, 300);
        // timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
