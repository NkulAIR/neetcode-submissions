class Solution {
    public int pivotIndex(int[] nums) {
        int left_weight = 0;
        int total_weight = 0;
        // The running total will be the left weight
        // By knowing the total and left weight, we dont need to calculate the right weight 

        // Iterate thorugh the array to get the total_weight
        for (int i = 0; i < nums.length; i++){
            total_weight += nums[i];
        }


        for (int i = 0; i < nums.length; i ++){
            int right_weight = total_weight - left_weight - nums[i];
            if (left_weight == right_weight){
                return i;
            }
            else {
                left_weight += nums[i];
            }
        }

        return -1;
        
    }
}