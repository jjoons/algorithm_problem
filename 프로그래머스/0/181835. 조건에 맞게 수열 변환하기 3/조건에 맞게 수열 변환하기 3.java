class Solution {
    public int[] solution(int[] arr, int k) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            newArr[i] = k % 2 == 0 ? val + k : val * k;
        }
        
        return newArr;
    }
}