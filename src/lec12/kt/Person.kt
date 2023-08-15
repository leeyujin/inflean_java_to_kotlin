package lec12.kt

fun main(){
    // 이름이 없는 경우 호출
//    Person.Companion.newBaby("ABC");

    // @JvmStatic을 붙이면 바로 접근 가능
    Person.newBaby("ABC")

    // 이름 호출
    Person.Factory.newBaby("ABC");

    // 싱글톤 접근
    println(Singletone.a)
    Singletone.a += 10;
    println(Singletone.a)

}


class Person private constructor(
    name: String ,
    age: Int
) {
    // 코틀린은 static이 없다 , 동행 객체
    // 클래스와 동행하는 유일한 오브젝트 - 이름을 붙일 수 있다
    companion object Factory : Log{
//    companion object {
        // val 은 런타임 시, const는 컴파일 시 변수 할당
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory 에요")
        }
    }
}


// 하나의 싱글톤 클래스
object Singletone {
    var a: Int = 0;
}




