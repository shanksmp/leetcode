class Solution {
    public void moveZeroes(int[] nums) {
        int read = 0;
        int write = 0;
        for(read = 0; read < nums.length; read++){
            if(nums[read] != 0 ){
                nums[write] = nums[read];
                write++;
            }
        }
        while(write < nums.length){
            nums[write] = 0;
            write++;
        }
    }
}