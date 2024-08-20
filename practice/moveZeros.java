class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }
        for (int i = a; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

public class moveZeros {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: ");
        printArray(nums);
        
        solution.moveZeroes(nums);
        
        System.out.println("Array after moving zeroes: ");
        printArray(nums);
    }
    
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
