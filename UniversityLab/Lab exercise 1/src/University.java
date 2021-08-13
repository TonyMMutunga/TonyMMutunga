
import java.util.Scanner;
public class University {


public static void main(String [] args ){

    System.out.println("Input results:");
    Scanner input =new Scanner(System.in);
   int kcse= input.nextInt();
   int interview= input.nextInt();
   int confidence= input.nextInt();

    if(((kcse >=65) && (interview >=6) &&(confidence>=5))); {
        System.out.println("Admitted");

        } if(((kcse <65) && (interview<6) && (confidence<5)));
    {
        System.out.println("Rejected");
    }
    }}





