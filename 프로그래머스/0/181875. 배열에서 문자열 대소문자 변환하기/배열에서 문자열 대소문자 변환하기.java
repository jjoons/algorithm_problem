class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            String val = strArr[i];
            answer[i] = i % 2 == 1 ? val.toUpperCase() : val.toLowerCase();
        }
        
        return answer;
    }
}