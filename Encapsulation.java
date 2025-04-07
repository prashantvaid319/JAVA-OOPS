// No import statement needed
class Account {
   public String name; // access modifier , only package can access its default
   protected String email;
   private String password; // only Account class can access private individual class can access its private
   //getters and setters
   public String getPassword(){
      return this.password;
   }
   public void setPassword( String pass){
    this.password=pass;
   }
}
public class Encapsulation {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Prashant";
        account1.email="prashantvaid40@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.name);
        System.out.println(account1.email);
        System.out.println(account1.getPassword());
        
    }
}
