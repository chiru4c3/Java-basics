public class Scoping {
    public static void main(String[] args) {//main function starts
        int a=10;// ini
        int b=20; //

        { //block scope starts//
          // int a=88; //a is already initialized in block in  main fn ,but we can modify it ie a=89;
            int c=99;
            //values initialized in this block will remain in this block
            System.out.println(c);
        } //block scope ends//
        //System.out.println(c);//c is inside a block but printing wil not work if its outside of the block
        //scoping for loops
        for (int i=0;i < 4; i++){
            System.out.println(i);
            int nums=90;
           // int a= 10;//cannot initialize again if they are already initialized outside
            //any thing initialized outside the block can be used inside the block but anything initialized inside the block cannot be initialized outside but we can reinitialize same variable outside the block
        }

    }// main function ends






    static void random(){ //function scope starts
        //System.out.println(a);// a will be accessed only in main method which where it declared
    int num=67;
    System.out.println(num); //num can be printed
    }//function scope ends
}
//scoping means where we can access variables