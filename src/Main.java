import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        boolean isValidAge;
        if (age >= 18 && age <=65) {
            isValidAge = true;
        } else {
            isValidAge = false;
        }


        System.out.println("Enter Security Code: ");
        int code = input.nextInt();
        boolean isValidCode;
        if (code % 10 == 0){
            isValidCode = false;
        }else if (code % 5 == 0 || code % 7 == 0){
            isValidCode = true;
        }


        System.out.println("Enter Clearance Level: ");
        int clearance = input.nextInt();
        boolean isBlocked;
        if (clearance <= 3 && clearance >= 1){
            isBlocked = false;
        } else
            isBlocked = false;



        /*
                 isValidAge: True if Age is between 18 and 65 (inclusive).
         isValidCode: True if the Security Code meets all of the following criteria:
         It is divisible by 5 OR divisible by 7.
         AND... it is NOT divisible by 10.
         isBlocked: True if the Clearance Level is NOT 1, 2, or 3.
        */




    }
}