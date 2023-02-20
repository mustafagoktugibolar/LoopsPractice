import java.util.Scanner;

public class MaxMin {
    public static void find(){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int enteredInput, input;

        System.out.print("How many numbers you want to enter : ");
        enteredInput = sc.nextInt();

        for(int i = 1; i <= enteredInput; i++){
            System.out.print("Enter the " + i + ". number :");
            input = sc.nextInt();

            if(i == 1){
                min = input;
                max = input;
            }
            else if(input > max){
                max =input;
            }
            else if(input < min){
                min = input;
            }
        }
        System.out.println("The Biggest number :" + max);
        System.out.println("The smallest number :" + min);

    }
}
