public class Main {
    public static void main(String[] args) {
       int ans = sum2();
       System.out.println(ans);

    }
    static void sum(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }
    static int sum2(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }
}