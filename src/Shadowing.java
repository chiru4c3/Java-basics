public class Shadowing { //shadowing is using two variables with same name within the scope which overlaps
    static int x=90; //it will be available to entire calss shadowing // this will be shadowed at line 6 and 7 lower level is overriding the higher level variables
    public static void main(String[] args) {
        System.out.println(x); //op=90
        //int x=40;  //class variable x is shadowed by this line
        //int x; //declaring
        //System.out.println(x); //calss variable is shadowed here
       // x=40; //initializing //scope will be begin when value is initiazed

        System.out.println(x); //op=40
        fun(); //op=90


    }
    static void fun(){
        int x=80;
        System.out.println(x);
    }
}
