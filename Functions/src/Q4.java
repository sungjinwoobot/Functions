import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = EvenOdd(n);
        System.out.println(ans);
    }
    static boolean EvenOdd(int n){
        if (n % 2 == 0){

            return true;
        }
        else{

        }return false;
    }
}
