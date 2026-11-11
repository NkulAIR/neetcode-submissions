class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < temperatures.length; i++){
            int currTemp = temperatures[i];
            
            while(!stack.isEmpty() && temperatures[stack.peek()] < currTemp){
                int prevDay = stack.pop();
                answer[prevDay] = i - prevDay;
            }
            stack.push(i);
        }
        return answer;
    }
}
