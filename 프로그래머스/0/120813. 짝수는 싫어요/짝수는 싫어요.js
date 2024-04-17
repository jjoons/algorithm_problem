function solution(n) {
    const len = (n % 2 == 1 ? n + 1 : n) / 2
    let a = 1
    return [...Array(len)].map((_, i) => i + a++)
}