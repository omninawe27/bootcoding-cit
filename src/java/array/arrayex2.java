package array;

public class arrayex2 {
    public static void main(String[] args) {
        int[] arr={5,9,15,2,8};
                int[] temp;
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2 ==0)
            {
                System.out.println("" +arr[i]);
            }
        }
    }

};
