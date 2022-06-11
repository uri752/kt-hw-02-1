fun main() {
    // за переводы с любых карт комиссия 0.75%, минимум 35 рублей.
    var amount = 153_000 // сумма перевода в копейках

    // вычислить комиссию в копейках
    var commission = calcCommission(amount)

    println("Комиссия с суммы перевода $amount составляет $commission копеек")
}

fun calcCommission(amount: Int): Int {
    // расчеты в копейках
    var res: Int = (amount * 0.75/100).toInt()
    if(res<35*100){
        res = 35*100
    }
    return res
}