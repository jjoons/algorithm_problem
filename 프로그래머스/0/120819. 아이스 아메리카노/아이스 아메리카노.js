function solution(money) {
    const aaMoney = 5500
    const count = ~~(money / aaMoney)
    const remainMoney = money - aaMoney * count
    return [count, remainMoney]
}