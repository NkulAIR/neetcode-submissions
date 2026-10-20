// import java.utils.ArrayList;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> counted = new ArrayList<>();
        for (int n : nums){
            if (counted.contains(n)){
                return true;
            }
            else{
                counted.add(n);
            }
        }
        return false;
        
    }
}