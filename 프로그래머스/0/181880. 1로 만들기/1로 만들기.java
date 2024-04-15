class Solution {
    private static int calcSubstractCount(int num) {
        int count = 0;
        int calcVal = num;

        while (true) {
            if (calcVal == 1) {
                break;
            }

            if (calcVal % 2 == 1) {
                calcVal -= 1;
            }

            calcVal /= 2;
            count++;
        }
        
        return count;
    }
    
    public int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            answer += calcSubstractCount(num_list[i]);
        }

        return answer;
    }
}