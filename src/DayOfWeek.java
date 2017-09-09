/* 
    Group 6
 
    @authors:  
    Munoz Yohana @student Number 2013664 
    Perez Jinger @student Number 2013665                   
*/

//Enum class which holds the days
public enum DayOfWeek {
    Sunday    (0), 
    Monday    (1), 
    Tuesday   (2), 
    Wednesday (3), 
    Thursday  (4), 
    Friday    (5), 
    Saturday  (6);

    //Stores Enum values
    private final int d;

    /*The following methods will set the variables and
    make them ready to be used when printing to the screen
     */
    //Takes the enum values as integers
    DayOfWeek(int day){
        this.d=day;
    }
    //Returns the value as integer
    public int getDay(){
        return d;
    }





}//end enum class
