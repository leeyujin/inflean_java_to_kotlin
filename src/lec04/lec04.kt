package lec04

fun main() {

    val money1 =  JavaMoney(2_000L)
    val money2 =  JavaMoney(1_000L)

    // 객체 비교 시 compareTo 호출
    if( money1 > money2 ) {
        println("Money1이 Money2보다 큽니다 ")
    }

    val moneyA = JavaMoney(1_000L)
    val moneyB = moneyA
    val moneyC = JavaMoney(1_000L)

    // 주소 비교시 ===
    println(moneyA === moneyB)

    // 값 비교 시 ==
    println(moneyA == moneyC)
}