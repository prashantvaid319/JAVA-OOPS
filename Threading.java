
public class Threading extends Thread {
    @Override public void run() {
        System.out.println("Threading is running in " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);   
        }
    }
    public static void main(String[] args) throws InterruptedException {

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        MyThread1.sleep(1000);
        myThread1.join();
        System.out.println(myThread1.getState());
        System.out.println(myThread1.getState());
        Threading threading = new Threading();
        System.out.println(threading.getState());
        threading.start();
        System.out.println(threading.getState());
        Threading.sleep(1000);
        System.out.println(threading.getState());
        threading.join();
        System.out.println(threading.getState());
        System.out.println("Threading Example");
        System.out.println(Thread.currentThread().getName() + " is running");
        // Creating an instance of the Thread class
        World world = new World();
        world.start();
        Random random = new Random();
        random.start();
        Thread myThread = new Thread(new MyThread());
        myThread.start();
    }
}
class World extends Thread{
    @Override public void run(){
        System.out.println("World is running in " + Thread.currentThread().getName());
    }

}
class Random extends Thread{
    @Override public void run(){
        System.out.println("Random is running in " + Thread.currentThread().getName());
    }
}
class MyThread implements Runnable{
    @Override public void run(){
        System.out.println("MyThread is running in " + Thread.currentThread().getName());
    }
}
class MyThread1 extends Thread{
    @Override public void run(){
        //System.out.println("MyThread1 is running in " + Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println(i);
        }
        //System.out.println(MyThread1.currentThread().getState());
    }
}