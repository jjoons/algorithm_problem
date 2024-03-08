class Solution {
    public int solution(int number, int n, int m) {
        int nRes = number % n;
        int mRes = number % m;
        
        if (nRes == 0 && mRes == 0) {
            return 1;
        }
        
        return 0;
    }
}