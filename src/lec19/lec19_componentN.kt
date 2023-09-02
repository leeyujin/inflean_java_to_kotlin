package lec19

// data는 기본적으로 componentN 함수를 만들어냄
// component1 -> 첫번째 프로퍼티 가져옴
data class Person(
    val name: String,
    val age: Int
)

class Person2(
    val name: String,
    val age: Int
){
    // 연산자의 속성을 갖고있기때문에 연산자 오버로딩 'operator' 명시
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}


fun main(){
    val person = Person("yujin", 100)
    val (name,age) = person
//    val name = person.component1()
//    val age = person.component2()

    val person2 = Person2("yujin2", 102)
    val (name2,age2) = person2


    println("이름 : ${name} , 나이 : ${age}")
    println("이름2 : ${name2} , 나이2 : ${age2}")
}