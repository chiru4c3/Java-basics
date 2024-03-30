import java.util.Arrays;

public class VarArgs { //length varies based on inputs so its not constant
    public static void main(String[] args) {
        fun(2,3,5,56,878,7979); //called with zero or more arguments //v is declared as an array of int
        multiple(1,2,"Chiru" ,"LMAO");
    } //if u have mixed arguments

    static void multiple(int a,int b, String ...c){ //var args should be at the end only
        //System.out.println(Arrays.toString(a,b,c));

    }




    static void fun(int ...v){ //here int ...v takes internally array of integers if it string it take arrays of strings vice versa
        System.out.println(Arrays.toString(v));
    }
}
