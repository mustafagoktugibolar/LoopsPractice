
public class Fibonacci {
    public static void print(int number){
        int first = 0;
        int second = 1;
        int currentValue;

        System.out.print(first + " " + second  + " ");

        for(int i = 2; i < number; i++){
            currentValue = first + second;
            first = second;
            second = currentValue;

            System.out.print(currentValue + " ");
        }

    }
}
