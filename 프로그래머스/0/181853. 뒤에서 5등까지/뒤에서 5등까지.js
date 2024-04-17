function solution(num_list) {
    const a = num_list.sort((a, b) => a - b)
    const answer = []

    for (let i = 0; i < 5; i++) {
        answer.push(a[i])
    }
    
    return answer
}