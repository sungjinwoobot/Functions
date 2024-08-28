import java.util.Scanner;

public class Q5 {
    static void Eligible(int n){
        if(n>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Eligible(n);
    }
}
