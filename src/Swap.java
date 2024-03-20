import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//        Scanner in=new Scanner(System.in);
//        int a,b,temp;
//        System.out.println("enter the value a:");
//        a=in.nextInt();
//        System.out.println("enter the value b:");
//        b=in.nextInt();
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("after swap:"+a +" "+ b);
          swap(a,b);
        System.out.println(a+""+b);//didnt swap but why ? watch passing xample
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
