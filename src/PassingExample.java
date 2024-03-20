public class PassingExample {
    public static void main(String[] args) {

        String name="chiru";
        greet(name);

    }
    static void greet(String naam){
        System.out.println(naam); //no pass by reference in java only pass by value

    }
}
