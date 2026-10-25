class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int current_boundary = 0;
        int farthest_reach = 0;

        for (int i=0; i < nums.length-1;i++){
            int potential = i + nums[i];
            if (potential > farthest_reach){
                farthest_reach = potential;
            }
            if (i == current_boundary){
                jumps += 1;
                current_boundary = farthest_reach;
            }
        }
        
        return jumps;
    }
}
