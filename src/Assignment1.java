/* 
    
 
    @authors:  
    fekieeyoha 
    fekiee                   
*/

import java.util.Scanner;

    public class Assignment1{

        //User inputs will be store in these variables
        static int year = 0;
        static int day  = 0;

        //The following data types will store the result of calculations
        static int month  = 0;
        static int result = 0;

        //Storing the months
        static String months  = " ";
        static boolean isLeap = false;

        //Stores the date of the month
        static int date = 0;


    //Class to check leap year

    class leap{
        /*This method takes an input to calculates the leap years
        which returns a boolean called is leap which will be used 
        in the moduleM method to assign the values needed in the 
        formula below
        */
        public boolean leap (int year){
                //Checking for leap year
                if(year % 400==0){
                    isLeap=true;
                }else if (year%4==0){
             
                }
            return isLeap;
        }//End of method leap

    }//End of leap class    
    
        //Assigment Method which will hold all the operation
        Assignment1(){  //

            
            //Instiates a scanner to take user inputs
            Scanner sc = new Scanner(System.in);

            
            boolean number;

            //The user is asked to enter the day of the year.
            do{
                System.out.print("Enter the day number: ");
                
                if(sc.hasNextInt()){
                    day = sc.nextInt();

                if(day>0 && day <367){
                    number=true;
                }else{
                    //Message displays when day is out of range
                    System.out.println("Out of range");
                    number=false;
                }                                                     
                }else{
                    //Message displays when day is invalid
                    System.out.println("Invalid Input");
                    number=false;
                    sc.next();
                }

            }while(!(number));

            
            do{
                //The user is asked to enter the year.
                System.out.print("Enter the Year: ");
               
                if(sc.hasNextInt() ){
                   year = sc.nextInt();
               
                //Range of valid years 2000 and 2999. 
                if (year> 1999 && year<3000){   

                    number=true;
                }else{

                    System.out.println("Out of range");
                    number=false;
                }
                //The program should return an error statement if an invalid day or year is entered.
                }else{
                    //Message displays when year is out of range
                    System.out.println("Invalid Input");
                    number=false;
                    sc.next();
                }
                //This section will loop until all inputs are validated
            }while(!(number));

            /* The following formula using two integers along the user inputs which calculate 
            the centuries and then calcute the day of the month.
            */
            int Mmonth = moduleM(month, isLeap);
            
                  
            int A = (year-1) % 7;                                    
            int D = day % 7;
            int DM = (((year-1)/4) - (3*((year-1)/100+1)/4)) % 7;
            //
            result = (A + D + Mmonth + DM) % 7;


            /*The following piece of code is using the variable called day
            to determine the month of the year and the date depending on day input 
            and the range defined the variable called date will be set between 1-31.

            */      

                if (day>=1 && day <=31){
                    months="January ";
                    date = day; //Variable day is set with the value input by users for January
                }
                    /*From February on the date will be calculated using the input day substracting 
                    the first number of the range and then adding one
                    */ 
                if (day>=32 && day<=59){
                    months="February ";
                    date = day - 32 + 1; 
                }

                if(day>=60 && day<=90){ 
                    months="March ";
                    date = day - 60 + 1; 
                }

                if(day>=91 && day<=120){
                    months="April";
                    date = day - 91 + 1; 
                }

                if(day>=121 && day<=151){
                    months="May ";
                    date = day - 121 + 1; 
                }

                if(day>=152 && day<=181){                         
                    months="June ";                               
                    date = day - 152 + 1; 
                }

                if(day>=182 && day<=212){                       
                    months="July ";
                    date = day - 182 + 1; 
                }

                if(day>=213 && day<=243){                     
                    months="August ";
                    date = day - 213 + 1;                         
                }

                if(day>=244 && day<=273){ 
                    months="September ";
                    date = day - 244 + 1;   
                }

                if(day>=274 && day<=304){
                    months="October ";
                    date = day - 274 + 1; 
                }

                if(day>=305 && day<=334){
                    months="November ";
                    date = day - 305 + 1;
                }

                if(day>=335 && day<=365){
                    months="December ";
                    date = day - 335 + 1;
                }else if (day>365) {
                    System.out.println("Day out of range ");
                }

            /*This set of data type stores variables from getter methods which 
            are the final result and create the desire outputs */
    		int resul = this.getResult();
    		int date1 = this.getDate();
    		String months = this.getMonths();
    		String dayWeek = this.getDayOfWeek();

            //The final message to be display
           	System.out.println(dayWeek+", "+months + " "+ date1);

        }//End of the Assignment1 method

        /*The following setters and getters make the variables ready 
        to be used in TestA1 class for printing to the screen the 
        desired output.
        */
        
        //Months
        public void setMonths(String m){
            this.months=m;
        }
        public String getMonths(){
            return this.months;
        }
	   

        /*The following method brings the variable needed to get 
        the day of the week coming from the enum class and return it 
        as String */ 
	   public String getDayOfWeek(){
		String dayWeek="";
		for (DayOfWeek dow : DayOfWeek.values()){
			if(dow.getDay()==this.result)
				dayWeek=dow.toString();
			}
		return dayWeek;
        }//End of getDayOfWeek method

	
        //Results
        public void setResult(int res){
            this.result=res;
        }
        public int getResult(){
            return this.result;
        }
        //Dates
        public void setDate(int dat){
            this.date=dat;
        }
        public int getDate(){
            return this.date;
        }

        /*moduleM takes an int called month and a boolean called isLeap assigning
        values to every month to be used in the formula for regular years and leap
        years
        */
        public  int moduleM(int month, boolean isLeap){
            int module=0;                                                    
                                                                     
            switch(month){                                                    
                //January
                case 1:                                                    
                    module = 0;                                 
                break;
                //Februrary
                case 2: 
                    module = 3; 
                break;
                //March
                case 3:  
                    module = 3; 
                break;
                //April
                case 4:
                    if(isLeap==true)
                        module = 0;
                        else 
                    module = 6; 
                break;
                //May
                case 5:
                    if(isLeap==true)
                        module = 2;
                    else  
                        module = 1; 
                break;
                //June
                case 6: if(isLeap==true)
                    module = 5;
                else 
                    module = 4; 
                break;
                //July
                case 7: 
                    if(isLeap==true)
                    module = 0;
                else 
                    module = 6;
                break;                                              
                //August
                case 8:
                    if(isLeap==true)
                    module = 3;
                else                                              
                    module = 2; 
                break;                          
                //September
                case 9:
                    if(isLeap==true)
                    module = 6;
                else                                              
                    module = 5; 
                break;
                //October
                case 10:
                    if(isLeap==true)
                    module = 0;
                    else  
                    module = 1; 
                break;
                //November
                case 11:
                    if(isLeap==true)
                   module = 4;
                else  
                    module = 3; 
                break;
                //Dicember
                case 12:
                    if(isLeap==true)
                       module = 6;
                    else 
                    module = 5; 
                break;                                     
            }                                                    
            return module;                                                
        }//End of the moduleM method

        

    }//End of the Assignment1 class







