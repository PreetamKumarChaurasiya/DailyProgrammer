// import the scanner class for the user input
import java.util.Scanner;

public class stopwatch {
    // create a scanner object for user input
    static Scanner sc = new Scanner(System.in);
    // running flag to control the stopwatch loop
    static volatile boolean running = true;
    // paused flag to pause/resume the stopwatch
    static volatile boolean paused = false;
    // string to store userInput
    static String userInput;

    public static void main(String[] args) {
        // prompt the user to start or quit the program
        System.out.println("Press 'S' to start, 'Q' to quit");
        // read the user input
        userInput = sc.nextLine();
        // check if the user eants to start or quit the program
        if (userInput.equalsIgnoreCase("S")) {
            startStopwatch();
        } else if (userInput.equalsIgnoreCase("Q")) {
            System.out.println("\nExiting program");
        } else {
            System.out.println("Invalid input. Press 'S' to start, 'Q' to quit");
        }
    }

    private static void startStopwatch() {
        // get the current time in milliseconds
        final long startTime = System.currentTimeMillis();
        // array to store the elapsed time
        final long[] elapsedTime = {0};
        // array to store the pause duration
        final long[] pauseDuration = {0};
        // create a new thread for the stopwatch
        Thread stopwatchThread = new Thread(() -> {
            // loop until running is set to false
            while (running) {
                // check if the stopwatch is not paused
                if (!paused) {
                    // calculate the elapsed time
                    elapsedTime[0] = System.currentTimeMillis() - startTime - pauseDuration[0];
                }
                // format hte elapsed time as a string
                String timer = String.format("\rElapsed time: %02d:%02d:%02d:%03d ", elapsedTime[0] / 3600000, (elapsedTime[0] % 3600000) / 60000, (elapsedTime[0] % 60000) / 1000, elapsedTime[0] % 1000);
                try {
                    // print the elapsed time to the console
                    System.out.write(timer.getBytes());
                } catch (Exception e) {
                    // print the stack trace if an error occurs
                    e.printStackTrace();
                }
                try {
                    // sleep for 1 millisecond
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // print the stack trace if an error occurs
                    e.printStackTrace();
                }
            }
        });
        // start the stopwatch thread
        stopwatchThread.start();
        // prompt the user to pause, resume, or stop the stopwatch
        System.out.println("Press 'P' to pause, 'R' to resume, 'Enter' to stop");
        // loop until running is set to false
        while (running) {
            // read the user input
            userInput = sc.nextLine();
            // check if the user wants to pause the stopwatch
            if (userInput.equalsIgnoreCase("P")) {
                paused = true;
                pauseDuration[0] = System.currentTimeMillis() - startTime - elapsedTime[0];
                System.out.println("\nPaused");
                // check if the user wants to resume the stopwatch
            } else if (userInput.equalsIgnoreCase("R")) {
                paused = false;
                pauseDuration[0] = System.currentTimeMillis() - startTime - elapsedTime[0];
                System.out.println("\nResumed");
                // check if the user wants to stop the stopwatch
            } else {
                running = false;
                System.out.println("\nStopped");
            }
        }
    }
}