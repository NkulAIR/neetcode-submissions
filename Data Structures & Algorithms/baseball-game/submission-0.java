class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> record = new ArrayDeque<>();
        int total = 0;

        for (int i = 0; i < operations.length; i ++){
            if (operations[i].equals("+")){
                int top = record.pop();
                int newScore = top + record.peek();

                record.push(top);
                record.push(newScore);
            }
            else if (operations[i].equals("D")){
                int doubleRec = record.peek() * 2;
                record.push(doubleRec);
                
            }
            else if (operations[i].equals("C")){
                record.pop();
            }

            else {
                int value = Integer.parseInt(operations[i]);
                record.push(value);
            }
        }

        for (int rec : record){
            total += rec;
        }

        return total;
        
    }
}