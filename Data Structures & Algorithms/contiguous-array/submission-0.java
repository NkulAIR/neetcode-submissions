class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max_length = 0;
        int running_total = 0;


        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                running_total ++;
            }
            else if (nums[i] == 0){
                running_total--;
            }
            if (map.containsKey(running_total)){
                int distance = i - map.get(running_total);
                if (distance > max_length){
                    max_length = distance;
                }
            }
            else {
                map.put(running_total,i);
            }
        }

        return max_length;

    }
}
