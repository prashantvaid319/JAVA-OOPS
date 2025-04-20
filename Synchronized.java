public class Synchronized {
    public static void main(String[] args) {
        
        Counter counter = new Counter();// similar resource is shared between multiple threads
        // for accessing the shared resource only once by thread at a time we use synchronized block in the critical section where the shared resource is accessed and modified. 
        // synchronized block is used to lock an object for exclusive access by a thread.
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.getCount());
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> account.Withdraw(500), "Thread 1");
        Thread t2 = new Thread(() -> account.Withdraw(200), "Thread 2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Counter{
    private int count=0;
    // public Counter(int count ){
    //     this.count=count;
    // }
    public void increament(){
        synchronized(this){
            count++;
        }
        // count++;
    }
    public int getCount(){
        return count;
    }
}
class MyThread extends Thread{
    private Counter counter;
    public MyThread(Counter counter){
        this.counter=counter;
        start();
    }
    @Override public void run(){
        for(int i=0;i<1000;i++){
            counter.increament();
        }
        System.out.println("MyThread is running in " + Thread.currentThread().getName() + " count: " + counter.getCount());
    }
}
class BankAccount {
    private int balance = 1000;

    public synchronized void  Withdraw (int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
        // Add logic for withdrawal here
        if(balance >= amount){
            try {
                Thread.sleep(4000); // Simulate time taken to withdraw
            } catch (InterruptedException ex) {
            }
            System.out.println(Thread.currentThread().getName() + " Withdraws " + amount);
            balance -= amount;
        } else {
            System.out.println(Thread.currentThread().getName() + " Insufficient funds to withdraw " + amount);
        }
        System.out.println(Thread.currentThread().getName() + " Current balance: " + balance);
    }
}