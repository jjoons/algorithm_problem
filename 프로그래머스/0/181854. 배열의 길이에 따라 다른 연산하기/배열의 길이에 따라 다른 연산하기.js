function solution(arr, n) {
    let answer = Array.from(arr)

    for (let i = 0; i < answer.length; i++) {
        if (answer.length % 2 == 0) {
            i % 2 == 1 && (answer[i] += n)
        } else {
            i % 2 == 0 && (answer[i] += n)
        }
    }

    return answer
}