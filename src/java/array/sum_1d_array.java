package array;

import java.util.Scanner;
public class sum_1d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums;
        nums=new int[7];
        System.out.println("enter array :");
        for (int i = 0;i<7;i++) {
            nums[i]=sc.nextInt();}
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int r = i + 1;
            nums[r] = nums[i]+nums[r];
        }
        for(int i=0;i<7;i++)
        {
            System.out.println(""+nums[i]);
        }
    }
}

