function solution(price) {
    var answer = 0
    let discountRate = 0
    
    if (price >= 500000) {
        discountRate = .2
    } else if (price >= 300000) {
        discountRate = .1
    } else if (price >= 100000) {
        discountRate = .05
    }
    
    return ~~(price * (1 - discountRate))
}