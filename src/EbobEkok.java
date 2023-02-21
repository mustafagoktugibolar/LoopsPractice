import java.util.Scanner;

public class EbobEkok {
    public static void findEbob(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int number1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int number2 = sc.nextInt();
        int ebob = 1;

        for(int i = 1; i<= number1 && i <= number2; i++){
            if((number1 % i == 0) && (number2 % i == 0)){
                ebob = i;
            }
        }

        System.out.println("EBOB = " + ebob);
    }

    private static int findEbob(int number1, int number2){
       
        int ebob = 1;

        for(int i = 1; i<= number1 && i <= number2; i++){
            if((number1 % i == 0) && (number2 % i == 0)){
                ebob = i;
            }
        }

        return ebob;
    }

    public static void findEkok(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int number1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int number2 = sc.nextInt();
        int ekok = (number1 * number2) / findEbob(number1, number2);
        System.out.println("Ekok = " + ekok);
    
    }
}
