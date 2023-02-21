import java.util.Scanner;

public class PerfectNumber {
    public static void find(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        int perfect = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                perfect += i;
            }
        }
        if(perfect == number){
            System.out.println("This is a perfect number!");
        }
        else{
            System.out.println("This is not a perfect number!");
        }
    }
}
