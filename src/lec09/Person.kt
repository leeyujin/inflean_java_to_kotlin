package lec09

import java.lang.IllegalArgumentException

fun  main(){
    val person = Person("yujin", 100)
    // java 객체도 .필드 로 getter/setter 접근가능
    val person2 = JavaPerson("yujin", 100)
    println(person.name)
    println(person2.name)
    person.age = 10
    person2.age = 10
    println(person.age)
    println(person2.age)

    val person1 = Person("yujin");
    Person()
}

class Person(
    // 주생성자
     name: String,
    var age: Int
) {
    /*
    val name = name
        // 자기자신을 가르키는 backing field -> 거의안쓰고 아래처럼 씀
        get() = field.uppercase()

    fun getUppercaseName(): String = this.name.uppercase()
    val getUppercaseName: String
        get() = this.name.uppercase()
    */

    var name = name
        set(value){
            field = value.uppercase()
        }



    init {
        if( age <= 0 ){
            throw IllegalArgumentException("나이는 ${age}일 수  없습니다")
        }
        println("초기화 블록")
    }

    // 부생성자 -> 최종적으로 주 생성자를 this로 호출해야함
    constructor(name: String): this(name, 1){
        println("부생성자 1")
    }

    constructor(): this("홍길동"){
        println("부생성자 2")
    }
    /*
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult : Boolean
        get() {
            return this.age >= 20
        }
    */

    // 위 함수를 프로퍼티로 (custom getter)
    val isAdult : Boolean
        get() = this.age >= 20

}