import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        boolean flag = false;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    flag = true;
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        
        return result;
    }
}

    
