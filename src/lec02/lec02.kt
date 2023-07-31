package lec02

import java.lang.IllegalArgumentException

// null을 다루는 방법
fun main(){

    // safe call
    // null이 아니면 실행하고, null이면 실행하지 않는다 (그대로 null)
    val str: String? = "ABC"
    // 컴파일 에러
//    println(str.length)
    println(str?.length)

    val str2: String? = null
    println(str2)

    // Elvis 연산자
    // 앞의 연산 결과가 null이면 뒤의 값을 사용
    val str3: String? = null
    println(  str3?.length ?: 0)

    // null이면 NPE 발생
    println(startsWith("BC"))
}

fun startsWithA1(str : String?): Boolean {
    if( str == null ) {
        throw IllegalArgumentException("null comes")
    }
    return str.startsWith("A")
}

// 위 함수를 safe call + elvis 활용하여 개선
fun startsWithB1(str : String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null comes")
}


fun startsWithA2(str: String?): Boolean? {
    if( str == null ){
        return null
    }
    return str.startsWith("A")
}

fun startsWithB2(str: String?): Boolean? {
//    return str?.startsWith("A") ?: null
    return str?.startsWith("A")
}


fun startsWithA3(str: String?) : Boolean {
    if( str == null ){
        return false
    }
    return str.startsWith("A")
}

fun startsWithB3(str: String?) : Boolean {
    return str?.startsWith("A") ?: false
}

// null 아님 단언
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

