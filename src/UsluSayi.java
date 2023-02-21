import java.util.Scanner;

public class UsluSayi {
    public static void find(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number : ");
        int number = sc.nextInt();

        System.out.print("Power : ");
        int power = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++){
            result *= number;
        }

        System.out.println("Result is " + result);

    }
}
