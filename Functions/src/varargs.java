import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);//we can pass any number of integers or arguments
        multiple(20,30,"yash","trivedi","programing");
        
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a, int b, String ...name){

    }
}
