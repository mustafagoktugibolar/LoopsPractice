import java.util.Scanner;

public class TersUcgen {
    public static void draw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();

        for(int i = n; i > 0; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
