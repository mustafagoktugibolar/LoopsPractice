import java.util.Scanner;

public class Combination {
    private static int factoriel(int input){
        int result = 1;
            for(int i = 1; i <= input; i++){
                result*=i;
            }

        return result;
    }
    public static void find(){
        Scanner sc = new Scanner(System.in);
        // C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        sc.close();

        int result = factoriel(n) / (factoriel(n-r) * factoriel(r));

        System.out.println("Combination of (" 
        +n + "," + r + ") is " + result);
    }
}
