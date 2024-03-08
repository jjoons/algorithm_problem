class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr += num;
            } else {
                oddStr += num;
            }
        }
        
        int odd = Integer.parseInt(oddStr);
        int even = Integer.parseInt(evenStr);
        
        return odd + even;
    }
}
