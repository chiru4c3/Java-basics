import java.util.Scanner;

public class StringXample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter your name");
        String name=in.next();
        String personalized = myGreet(name);

        //String personalized = myGreet("chiru");
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }
}

