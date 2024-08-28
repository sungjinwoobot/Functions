public class shadowing {
    static int x = 20; //value shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x);
        int x =40;
        System.out.println(x); // x value is shadowed
        fun();


    }
    static void fun(){
        System.out.println(x);// x value is static int x = 0
    }
}
