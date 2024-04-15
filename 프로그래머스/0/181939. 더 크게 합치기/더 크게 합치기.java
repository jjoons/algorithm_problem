class Solution {
    public int solution(int a, int b) {
        String abStr = String.valueOf(a) + b;
        String baStr = String.valueOf(b) + a;

        int ab = Integer.parseInt(abStr);
        int ba = Integer.parseInt(baStr);
        
        
        return Math.max(ab, ba);
    }
}