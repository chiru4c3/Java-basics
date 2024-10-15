package dsa_1;

public class selcsort {

    public static void main(String[] args) {

        int nums[]={23,45,678,100,34,0,23};
        int size=nums.length;
        int temp = 0;
        int minIndex=0;

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num +" ");
        }

        for(int i=0; i<size-2;i++){


            for(int j=i+1 ;j<size;j++){

                if(nums[minIndex] > nums[j])
                    minIndex=j;


            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;

            System.out.println();

            for(int num : nums){
                System.out.print(num +" ");
            }
            //System.out.println();
        }





        System.out.println();
        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
