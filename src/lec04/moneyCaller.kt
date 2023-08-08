package lec04

fun main(){
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    // 연산자 오버로딩 가능
    // 객체마다 연산자 ( 단 항, 비교 연산 등)를 직접 정의할 수 있다
    println(money1.plus(money2))
    println(money1 + money2)
}