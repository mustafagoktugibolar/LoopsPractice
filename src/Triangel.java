import java.util.Scanner;

public class Triangel {
    public static void find(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        
        // n = 2 
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // n = 2
        for(int i = n; i > 0; i--){
            for(int j = 0; j <= (n - i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= ((2 * i) - 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
