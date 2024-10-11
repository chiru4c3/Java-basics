import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();//calling a function,() here goes arguments.
        //int ans =sum2(); //ans is a reference variable
        //System.out.println(ans);

        String message =greet();
        System.out.println(message);
        }


    /*static void sum(){ //void returns nothing ex-1



        Scanner in =new Scanner (System.in);
        int num1,num2,sum;
        System.out.println("enter number 1:");
        num1=in.nextInt();
        System.out.println("enter number 2:");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("the sum =" +sum);
    }*/
   /* static int sum2(){
        Scanner in =new Scanner (System.in);
        int num1,num2,sum;
        System.out.println("enter number 1:");
        num1=in.nextInt();
        System.out.println("enter number 2:");
        num2=in.nextInt();
        sum=num1+num2;
        return sum;//function ends

        //System.out.println("this will never execute"); // its unreachable.

    }*/
    static String greet(){
        //return 23; //required type is String only
        String greeting="How are you";
        return greeting;
    }

}

