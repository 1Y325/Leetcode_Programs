class Solution6 {

    public int removeDuplicates(int[] nums) {
        int res = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}