package lec03

fun main() {
    val number1 = 3
    // error 발생 (암시적 타입변환 안됨)
//    val number2: Long = number1

    //  명시적 타입변환 필요 (toType)
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    // null에 대응하여 적절한 처리 필요
    val number4: Long = number3?.toLong() ?: 0L

    val person = Person("yujin", 100)
    println("이름 ${person.age}")

    // 변수 이름만 사용할땐 다음과같이 $만으로 표기 가능하지만, ${변수}를 사용하는게 좋다..
    val name = "yujin"
    println("이름 $name")

    //ABC
    //EFG
    //kkk
    val trimIndent = """
        ABC
        EFG
        kkk
        """.trimIndent()

    println(trimIndent)

    val str = "ABCDE"
    println(str[1])
}

fun printAgeIfPerson(obj: Any){
    // 부정은 !is 혹은 ! (obj is Person)
    if( obj is Person ){

        // 아래 주석 두문장은 23라인 한문장으로 대체가능 (스마트 캐스트)
        // 코틀린 컴파일러가 타입체크를하여 타입 인지
//        val person = obj as Person
//        println( person.age )
        println(obj.age)
    }
}

fun printAgeIfPersonCanNullable(obj: Any?) {
    // 아래 문장은 obj가 null로 들어오는경우 NPE 발생
//    val person = obj as Person

    // 따라서, as?를 하여 컴파일 에러를 발생시키자
    // obj가 null이 아닌경우 Person 타입캐스팅
    val person = obj as? Person
    println(person?.age)
}


