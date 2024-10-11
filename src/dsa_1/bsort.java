package dsa_1;

public class bsort {

    public static void main(String[] args) {

        int nums[]={23,45,678,100,34,0};
        int size=nums.length;
        int temp = 0;

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num +" ");
        }

        for(int i=0;i<size;i++)//outer loop
        {
            for(int j=0;j<size-i-1;j++){ //inner loop

                if(nums[j] > nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }

            }


        }



        System.out.println();
        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
