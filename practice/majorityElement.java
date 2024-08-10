import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Example usage:
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = obj.majorityElement(nums);
        System.out.println("The majority element is: " + majority);
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
