class Solution {
    public static boolean isEven(int val) {
        return val % 2 == 0;
    }

    public int solution(int n) {
        int answer = 0;
        
        for (int i = isEven(n) ? n : n - 1; i > 1; i -= 2) {
            // System.out.println(i);
            answer += i;
        }
        
        return answer;
    }
}