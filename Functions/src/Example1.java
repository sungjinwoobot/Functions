public class Example1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "yash";


        {
            int c =20; // can be used inside the block only
             a = 30; //reassign the original value of reference(a) variable to another value
            System.out.println(a); // we can update value
            name = "trivedi";
            System.out.println(name);
        }// System.out.println(a); outside a update hora hai fir print
    }
//    static void random(){
//        int c = 10;
//        System.out.println(c);
    }



