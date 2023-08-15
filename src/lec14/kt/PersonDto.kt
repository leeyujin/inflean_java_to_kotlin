package lec14.kt

fun main(){
    val personDto = PersonDto("yujin", 30)
    val personDto2 = PersonDto("yujin", 40)
    // 마치 builder처럼 활용
    PersonDto(age=30, name="yujin")

    // equals
    println(personDto == personDto2)
    // toString
    println(personDto)



}


// equals, hashCode, toString 자동으로 만들어짐!
data class PersonDto(
    val name: String,
    val age: Int
)