import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("max is " +max(a,b,c));
    }
    static int max(int a ,int b, int c){
        int max = a;
        if(b>max){
            max=b;
        }if(c>max){
            max=c;
        }return max;
    }
}
