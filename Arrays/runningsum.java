import java.util.*;

public class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSumArray = new int[n];
        
        runningSumArray[0] = nums[0];
        for (int i = 1; i < n; i++) {
            runningSumArray[i] = runningSumArray[i - 1] + nums[i];
        }
        
        return runningSumArray;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution solution = new Solution();
        int[] runningSumArray = solution.runningSum(arr);
        
        for (int i = 0; i < n; i++) {
            System.out.print(runningSumArray[i] + " ");
        }
    }
}
