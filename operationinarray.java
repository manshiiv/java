import java.util.Arrays;
import java.util.Scanner;

public class operationinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrays[] = new int[n];
        
        for(int i=0;i<n;i++){
            arrays[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int[] result = s.applyOperations(arrays);
        System.out.println(Arrays.toString(result));
    }
}

    class Solution {
        public int[] applyOperations(int[] nums) {
             int n = nums.length;
             int temp =0;
            for(int i =0;i<nums.length -1;i++){
                if(nums[i] == nums[i+1]){
                    nums[i]= nums[i]*2;
                    nums[i+1] = 0;
                     } 
            }
            int j=0;
            int k=0;
            while(k <nums.length){
                if(nums[j]==0 ){
                    temp = nums[k];
                    nums[k]=nums[j];
                    nums[j]= temp;
                }
                if (nums[j] !=0){
                    j++;
                    k++;
                }
    
            }
            return nums;
        }
    }

