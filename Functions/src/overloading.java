public class overloading {
    public static void main(String[] args) {
        fun(10);
        fun("yash");
        fun(10,20);

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println(a+ " "+b);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
