import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] marks = {0,1,2,3,4};
        change(marks);
        System.out.println(Arrays.toString(marks));
    }
    static void change(int[] marks){
        marks[0] = marks[1];

    }
}
