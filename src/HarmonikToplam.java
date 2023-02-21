import java.util.Scanner;

public class HarmonikToplam {
    public static void find(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        double result = 0;
        sc.close();

        for(int i = 1; i <= number; i++){
            result += (double) 1 / i;
        }
        System.out.println("Result is " + result);
    }
}
