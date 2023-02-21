
public class Asal {
    private static boolean asalMi(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void find(){
        for(int i = 2; i <100; i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }
        
    }
}
