public class movesZero {

    public void move(int[] nums){
        int count = 0;
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];

            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }

        System.out.println("Modified array");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,0,3,0,3,0,2,0};
        movesZero move = new movesZero();
        move.move(nums);
        
    }
    
}
