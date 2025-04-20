public class ThreadMethods extends Thread {
    @Override public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " was interrupted.");
            }
        }
    } 
    public static void main(String[] args) {
        Thread thread1 = new ThreadMethods();
        Thread thread2 = new ThreadMethods();
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
        
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        
        System.out.println("Both threads have finished");
        System.out.println("Main thread is exiting.");
    }
}
