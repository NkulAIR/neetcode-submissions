class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maximum_area = 0;

        while (l < r){
            int width = r - l;
            int area = width * Math.min(heights[l],heights[r]);
            maximum_area = Math.max(maximum_area, area);

            if (heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maximum_area;


        
    }
}
