function solution(num_list) {
    var answer = 0;
    
    if (num_list.length >= 11) {
        for (const val of num_list) {
            answer += val
        }
    } else {
        answer = num_list[0]
        
        for (let i = 1; i < num_list.length; i++) {
            answer *= num_list[i]
        }
    }
    
    return answer;
}