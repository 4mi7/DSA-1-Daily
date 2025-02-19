public class removeDuplicates {
   
            public int RemoveDuplicates(int[] nums){
                int k = 1;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[i - 1]) {
                        nums[k++] = nums[i];
                    }
                }
                return k;
            }
            
    
        
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5,6,7,7};
        removeDuplicates sol = new removeDuplicates();
        int k = sol.RemoveDuplicates(nums);
        System.out.println(k);

    }
}



