package lec16

fun main(){
    var str = "ABC"
    // 확장함수를 멤버함수인것처럼 이용
    println(str.lastChar())

    // 확장함수와 멤버함수의 signature이 같은 경우 멤버함수를 우선 호출한다
    val person = Person("yujin", "lee", 30)
    person.nextYearAge()
}

// 확장 함수 확장하려는클래스(수신객체타입).함수이름
fun String.lastChar(): Char {
    // 인스턴스 접근 -> this(수신객체)
    return this[this.length -1 ]
}

// 확장프로퍼티처럼 사용
/*
val String.lastChar: Char
    get() = this[this.length -1]
*/


fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}