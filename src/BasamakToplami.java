import java.util.Scanner;

public class BasamakToplami {
    public static void find(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Digit number : ");
        int digit = sc.nextInt();

        int result = 0;
        
        for(int i = 1; i <= digit; i++){
            result += number % 10;
            number = number / 10;
        }
        System.out.println("Result is " + result);
    }
}
