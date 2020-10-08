import java.util.Scanner;

class L1_5_Mod {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int x = scan.nextInt();
        System.out.print("Enter another whole number: ");
        int y = scan.nextInt();

        System.out.println ("Division " + x + "/" + y + ": " + ( x / y));
        System.out.println("Remainder " + x + "%" + y + ": " + (x % y));
                
        //Use Mod 2 to find if a number is even or odd                    
        System.out.println("Checking if x is even or odd.");
        System.out.println("0 means even, 1 means odd - " + (x % 2));
                
        //Use Mod 10 to find the ones' digit
        System.out.println("What is the digit in the ones' place of x:" + (x % 10));

    }
}