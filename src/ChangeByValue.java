import java.util.Arrays;

public class ChangeByValue {
    public static void main(String[] args) {
        //create an arrya
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;//if u make a change to the object via this ref variable,same object will be changed
        nums[2]=97;
    }
}
