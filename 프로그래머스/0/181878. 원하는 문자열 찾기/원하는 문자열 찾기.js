function solution(myString, pat) {
    pat = pat.toLowerCase()
    myString = myString.toLowerCase()
    return myString.includes(pat) ? 1 : 0
}