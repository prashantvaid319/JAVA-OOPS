

public class ExceptionHandling{
    // public static void main(String []args){
    //     int [] numerators ={10,20,30,40,50};
    //     int [] denominators={2,0,3,4,5};
    //     for(int i=0;i<10;i++){
    //         try {
    //            System.out.println(divide(numerators[i],denominators[i]));
    //         }catch(Exception e){
    //             System.out.println("Exception caught: " + e.getMessage());
    //         }
    //     }
    //     System.out.println("Good Job! You have completed the program without any errors.");
    // }
    public static int  divide(int a ,int b){
        try {
            return a/b; 
        } catch (ArithmeticException e) {
            System.out.println(e);
                return -1;
        }
         
    }
    public static void level3  (){
        int [] arr=new int[5];
        arr[5]=10;
    } public static void level2(){
        level3();
    }
    public static void  level1(){
        level2();
    }
    public static void main(String [] args){
        Bank bank = new Bank(10);
        bank.withdraw();
        try {
            withdraw();
            System.out.println("Exception caught:"+e.getMessage());
            System.out.println("Exception caught:"+e.getMessage());
        }
        // level1();
    //    try {
    //     } catch (Exception e) {
           
    //         StackTraceElement[] stacktrace = e.getStackTrace();
    //         for(StackTraceElement element : stacktrace) {
    //             System.out.println("Class: " + element.getClassName());
    //             System.out.println("Method: " + element.getMethodName());
    //             System.out.println("Line Number: " + element.getLineNumber());
    //             System.out.println("File Name: " + element.getFileName());
    //         } 
    //     } finally {
    //         System.out.println("Good Job! You have completed the program without any errors.");
    //     }
    }
    class Myexeception extends Expection{
       
    }
    public static class Bank{
  
        private int balance=1000;
        public Bank(int balance){
            this.balance=balance;

        }
        public void withdraw() throws Exception{
            if(balance<1000){
                throw new Exception("Insufficient balance"); 
            } else{
                System.out.println("Withdrawn successfully");
                balance-=1000;
            }
        }
    }
 }
