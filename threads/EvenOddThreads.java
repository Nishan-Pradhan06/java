public class EvenOddThreads {

    public static void main(String[] args) {
        // Create a runnable for printing even numbers
        Runnable printEven = new Runnable() {
            @Override
            public void run() {
                for (int i = 11; i <= 30; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even: " + i);
                    }
                }
            }
        };

        // Create a runnable for printing odd numbers
        Runnable printOdd = new Runnable() {
            @Override
            public void run() {
                for (int i = 11; i <= 30; i++) {
                    if (i % 2 != 0) {
                        System.out.println("Odd: " + i);
                    }
                }
            }
        };

        // Create threads for the runnables
        Thread evenThread = new Thread(printEven);
        Thread oddThread = new Thread(printOdd);

        // Start the threads
        evenThread.start();
        oddThread.start();

        // Join the threads to ensure main thread waits for them to finish
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
