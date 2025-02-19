public class removeElement {
   
  public int remove(int[] nums, int val){
        int count =0;
        for(int i = 0; i<nums.length;  i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
   }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5,0,0,2,3,4,21,1,4};
        int val = 3;    
        removeElement remove = new removeElement();
        int k = remove.remove(nums, val);
        System.out.println(k);
    }
}
