function solution(my_string, n) {
    return [...my_string].map(v => [...Array(n)].reduce((acc = v) => acc + v))
        .join('')
}