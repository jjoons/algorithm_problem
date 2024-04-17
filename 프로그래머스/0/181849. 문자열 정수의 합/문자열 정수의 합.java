class Solution {
    public int solution(String num_str) {
        String[] strArr = num_str.split("");
        int result = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            result += Integer.parseInt(strArr[i]);
        }
        
        return result;
    }
}