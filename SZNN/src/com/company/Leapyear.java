
public class Leapyear {
    public static void main(String[] args) {
        // write your code here

        int year= 1600;
        boolean leap =false;


        if(year %4 ==0) {
if (year % 100 ==0){
            if (year % 400 == 0)
                leap = true;
                        else leap = false;}

             else leap = true;}
else leap= false;
            if (leap)
                System.out.println( year + " is a leap year");
            else
                System.out.println( year + " is not a leap year");
        }

}

