import java.util.Scanner;
public class Olympics {

    public static void main(String[] args){

       int aNumber;

        Scanner in= new Scanner(System.in);

        System.out.print("Enter year:\n");
        aNumber= in.nextInt();
        System.out.print("Year is:" +aNumber);

        int count= 1;

        while (count!=0){
            if ((aNumber>= 1500) || (aNumber >= 1890)){
                System.out.println("\nIs an Olympic year");

        break;
            }
else {
                System.out.println("\nIs not an olympic year");
                System.out.println("Enter Year again");
                count = +3;
                break;
            }
        }


    }
}

