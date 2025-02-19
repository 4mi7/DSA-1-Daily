import java.util.Arrays;

public class P2460{

    public int[] applyOperations(int[] nums) {
            int index = 0;
            int ans[] = new int[nums.length];

            for(int i = 0; i < nums.length-1; i++){
                if(nums[i]>0 && nums[i] == nums[i+1]){
                    ans[index++] = nums[i]*2;
                    nums[i+1] = 0;
                }else if(nums[i] != 0){
                    ans[index++] = nums[i];
                }
            }

            if (nums[nums.length - 1] != 0) {
                ans[index] = nums[nums.length - 1];
            }
            return ans;
    }
     public static void main(String[] args) {
        P2460 p = new P2460();
        int[] nums = {2, 2, 0, 4, 4, 8};
        System.out.println(Arrays.toString(p.applyOperations(nums))); // Expected Output: [4, 8, 8, 0, 0, 0]
    }
}
