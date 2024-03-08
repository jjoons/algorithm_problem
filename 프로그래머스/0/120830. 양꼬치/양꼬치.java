class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int yang = 12000 * n;
        int drink = 2000 * k;
        int bonusDrink = 2000 * (n / 10);
        answer = yang + drink - bonusDrink;
        
        return answer;
    }
}