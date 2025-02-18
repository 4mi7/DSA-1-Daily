public class twoSum{
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


public static void main(String[] args){
    int[] result1 = twoSum(new int[]{2,7,11,14}, 9);
    System.out.println("[" + result1[0] + "," + result1[1]+ "]");

    int[] result2 = twoSum(new int[]{8,2,4,1}, 9);
    System.out.println("[" + result2[0] + "," + result2[1]+ "]");
}
}