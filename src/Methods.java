import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("enter number 1:");
        num1=in.nextInt();
        System.out.println("enter number 2:");
        num2=in.nextInt();
         sum=num1+num2;
        System.out.println("the sum =" +sum);
    }


}
