 class Interface{
  public static void main(String[] args) {
       Bike mb = new MountainBike();
       if(mb.fuel(12)){
        mb.start();
        mb.accelerate();
        mb.gearUp();
        mb.run();
        Bike.gearDown();
        mb.brake(50);
        mb.stopbike();
    }else{
        System.out.println("Bike is not started as fuel is not full");
    }
        // mb.start();
        // mb.fuel(10);
        // mb.accelerate();
        // mb.gearUp();
        // mb.run();
        // Bike.gearDown();
        // mb.brake(50);
        // mb.stopbike();
        System.out.println("Max speed is " + Bike.MAX_SPEED);
        System.out.println("Max gear is " + Bike.MAX_GEAR);
        System.out.println("Max gear is " + Bike.MIN_GEAR);
       //mb.ride();
       Bicycle b = new MountainBike();
       b.ride();
       b.brake();
       b.stop();
    
  }
}
interface Bike{
    int MAX_GEAR=5;
    int MAX_SPEED=410;
    int MIN_GEAR=1;
    //int fuel=100;
    public void run();
    public void start();
    public void accelerate();
    public void brake(int speed);
    public void stopbike();
    public void gearUp();
    public static void gearDown(){
        System.out.println("Bike gear is down");
    }
    public default void fuelDown(){
        System.out.println("Bike fuel is down");
    }
    public default Boolean fuel(int fuel){
        Boolean isFuelFull = false;
        if(fuel<100){
            this.fuelDown();
        }else{
            System.out.println("Bike fuel is full");
            isFuelFull=true;
        }
        return isFuelFull;
    }
}
interface Bicycle{
    public void ride();
    public void brake();
    public void stop();

}
class MountainBike implements Bike,Bicycle{
    public void run(){
        System.out.println("Bike is running");
    }
    public void start(){
        System.out.println("Bike has started");
    }
    public void accelerate(){
        System.out.println("Bike is accelerating speed");
    }
    public void brake(int speed){
        System.out.println("Bike is braking at speed " + speed);
    }
    public void brake(){
        System.out.println("Bicycle is braking");
    }
    public void stop(){
        System.out.println("Bicycle has stopped");
    }
    public void stopbike(){
        System.out.println("Bike has stopped");
    }
    public void ride(){
        System.out.println("Bicycle is riding");
    }
    public void gearUp(){
        System.out.println("Bike gear is up");
    }
}
