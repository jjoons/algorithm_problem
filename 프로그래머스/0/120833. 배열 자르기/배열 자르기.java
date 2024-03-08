class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int answerSize = num2 - num1 + 1;
        int[] answer = new int[answerSize];

        for (int i = 0, j = num1; i < answerSize; i++, j++) {
            answer[i] = numbers[j];
        }

        return answer;
    }
}