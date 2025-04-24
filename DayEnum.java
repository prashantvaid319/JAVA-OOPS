public enum DayEnum{
    MONDAY("monday","sonwar"),TUESDAY("tuesday","mangalwar"),WEDNESDAY("wednesday","budhwar"),THURSDAY("thursday","guruwar"),FRIDAY("friday","shukrawar"),SATURDAY("saturday","shanivar"),SUNDAY("sunday","raviwar");

    
    //these Monday tuesday wednesday are final instances of the DayEnum class
    //and they are not modifiable
    private DayEnum(String lower,String hindi){
        //System.out.println("Private custom constructor called for "+ lower);
        this.lower = lower;
        this.hindi = hindi;
    }
    private String lower;
    private String hindi;
    public void displayHindi(){
        System.out.println("Day of the week in Hindi: "+ this.hindi);
    }
    public void displayLower(){
        System.out.println("Day of the week: "+ this.lower);
    }
    public void display(){
        System.out.println("Day of the week: "+ this.name());
    }
}