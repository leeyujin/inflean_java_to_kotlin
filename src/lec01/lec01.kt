package lec01

fun main() {
    // 가변
    var number1 = 10L
    number1 = 5L

    // 불변
    // 타입을 명시적으로 작성하지 않아도, 타입이 추론된다.
    val number2 = 10L
//    number2 = 5L

    // 타입 명시적 지정
    var number3: Long = 5
    println(number3)

    // Long으로 작성해도 코틀린 내부에서는 long으로 처리 => 불필요한 박싱,언박싱 없다
    // Primitive Type과 Reference Type을 구분하지 않아도 된다
    val number4 : Long = 10L
    var number5 : Long = 1_000L


    var number6 = 1_000L
    // 기본적으로 모든 변수는 null이될 수 없다
//    number6 = null

    // 타입 뒤에 '?' 를 지정해줘야 null이 들어갈 수 있다
    var number7 : Long? = 1_000L
    number7 = null

    // 객체 인스턴스화 할 때 'new'를 쓰지않아야함
//    var person = Person("이유진")

}