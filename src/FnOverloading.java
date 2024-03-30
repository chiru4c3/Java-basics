public class FnOverloading { //if same fun names but diff types will be worked otherwise they come up with error at compile time it decides which fn to run
   //works when no.of args are different or the type of args are different
    //ambiguity arises when two same named functions which has different type args and called with empty args
    public static void main(String[] args) {
        fun(67);
        fun("HELLO");

    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);

    }
}
