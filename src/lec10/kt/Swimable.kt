package lec10.kt

interface Swimable {

    // backing field없는 프로퍼티를 인터페이스에 만들 수 있다
    val swimAbility: Int
        get() = 3


    // default 키워드 없이 default 메소드 구현가능
    fun act(){
        println(swimAbility)
        println("어푸 어푸")
    }

    // 추상메소드 적는법
//    fun temp();
}