class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (arr.length % 2 == 0) {
                answer[i] = i % 2 == 1 ? val + n : val;
            } else {
                answer[i] = val;
                answer[i] += i % 2 == 0 ? n : 0;
            }
        }
        
        return answer;
    }
}