package lec10.kt

fun main(){
    // 호출결과
    // Base Class
    // 0
    // Derived Class
    val derived = Derived(20)
}

open class Base(
    open val number: Int = 100
){
    init{
        println("Base Class")
        // 상위클래스 생성자,초기화 블록에서 하위클래스 내 override하고있는 field에 접근하면 안된다
        // -> 초기화되기전의 값에 접근 -> default값인 0 출력
        println(number)
    }
}

class Derived(
   override val number: Int
) : Base(number) {

    init {
        println("Derived Class")
    }

}