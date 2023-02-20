import java.util.Scanner;

public class PowersOf4and5 {
    public static void find(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        sc.close();

        for(int i = 1; i <= number; i *= 4){
            System.out.print(i + ", ");
        }
        System.out.println("");
        for(int i = 1; i <= number; i *= 5){
            System.out.print(i + ", ");
        }
        


    }
}
