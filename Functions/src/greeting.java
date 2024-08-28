import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String message = greet();
//        String name = sc.next();
//        System.out.println(message +name);
//        Scanner sc = new Scanner(System.in);
//        String Name = sc.nextLine();
        String greeting = greet("YASH");
        System.out.println(greeting);
    }
    static String greet(String Name){
        Name = "rahul";
        return "hello "+Name;
    }
}