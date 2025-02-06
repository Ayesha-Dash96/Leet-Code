class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            output[0] = i;
            for(int j = i + 1 ; j < nums.length; j++){
                output[1] = j;
                if(nums[i] + nums[j] == target){
                    return output;
                }

            }
        }
        return output;
    }
}
