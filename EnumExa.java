// Removed package declaration to match the directory structure
public class EnumExa{
    public static void main(String [] args){
        System.out.println("Day of the week: " + DayEnum.MONDAY);
        System.out.println("Day of the week: " + DayEnum.TUESDAY);
        System.out.println("Day of the week: " + DayEnum.WEDNESDAY);
        System.out.println("Day of the week: " + DayEnum.THURSDAY);
        System.out.println("Day of the week: " + DayEnum.FRIDAY);
        System.out.println("Day of the week: " + DayEnum.SATURDAY);
        System.out.println("Day of the week: " + DayEnum.SUNDAY);
        System.out.println("Day of the week: " + DayEnum.SUNDAY);
        DayEnum day = DayEnum.MONDAY;
        System.out.println("Day of the week: " + day);
        System.out.println(day.ordinal()); // 0
        DayEnum day1 = DayEnum.TUESDAY;
        System.out.println("Day of the week: "+ day1);
        System.out.println(day1.ordinal());
        DayEnum day2 = DayEnum.valueOf(("MONDAY"));
        System.out.println(day2); // MONDAY
        DayEnum [] days = new DayEnum[DayEnum.values().length];
        for(int i = 0; i <= DayEnum.values().length; i++){
            System.out.println("Week Day is: "+ DayEnum.values()[i]);
        }
       //DayEnum day = DayEnum.TUESDAY; // Create an instance of the enum
    //    day.displayLower(); // Call the displayLower method on the enum instance
    //    day.displayHindi(); // Call the displayHindi method on the enum instance
       System.out.println(
           switch (day) {
               case MONDAY -> "Monday is the first day of the week.";
               case TUESDAY -> "Tuesday is the second day of the week.";
               case WEDNESDAY -> "Wednesday is the third day of the week.";
               case THURSDAY -> "Thursday is the fourth day of the week.";
               case FRIDAY -> "Friday is the fifth day of the week.";
               case SATURDAY -> "Saturday is the sixth day of the week.";
               case SUNDAY -> "Sunday is the seventh day of the week.";
               default -> "Invalid day.";
           }
       );
       day.displayHindi();
        

      
        day.display(); // Call the display method on the enum instance
        Th thread = new Th();
        thread.start();
        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}


class Th extends Thread{
    public void run(){
        for(int i = 0; i <= DayEnum.values().length; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Thread is running: "+ Thread.currentThread().getName()+ " "+ DayEnum.values()[i]);
        }
    }

}
