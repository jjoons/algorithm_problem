class Solution {
    public String solution(String my_string, int k) {
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < k; i++) {
            returnValue.append(my_string);
        }
           
        return returnValue.toString(); // my_string.repeat(k);
    }
}