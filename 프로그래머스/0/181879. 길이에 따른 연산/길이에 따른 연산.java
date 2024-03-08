class Solution {
    public int solution(int[] num_list) {
        int returnValue = 0;

        if (num_list.length > 10) {
            for (int val : num_list) {
                returnValue += val;
            }
        } else {
            returnValue = num_list[0];

            for (int i = 1; i < num_list.length; i++) {
                returnValue *= num_list[i];
            }
        }

        return returnValue;
    }
}