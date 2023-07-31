package lec02

// platform type : 코틀린이 null 관련 정보를 알 수 없는 타입
// Runtime 시 Exception이 날 수 있다 -> Person에 @NotNull등이 없을 때 
fun main(){
    val person = Person("공부하는 개발자")
    startsWithA(person.name)
}

fun startsWithA(str : String): Boolean {
    return str.startsWith("A")
}