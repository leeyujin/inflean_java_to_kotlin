package lec08

fun main(){
    repeat("Hello World" , 3 , false)
    // named Argument , 일부 default 파라미터 활용하되 일부 값만 변경
    repeat("Hello World" , useNewLine = false)

    // 동일한 타입이니 바꿔써버릴 수 있음 -> builder를 활용하면 예방가능.
    // namedArgument는 builder처럼 쓸 수 있다
    printNameAndGender("FEMALE", "이유진")
    printNameAndGender(name = "이유진", gender = "FEMALE")

    // kotlin에서 java함수를 가져다 사용할때는 named Argument를 사용할 수 없다
    // java를 byte코드로 변환할 때, 파라미터 이름을 보존하고있지 않기 때문

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    // 가변인자 함수를 배열과 호출할 때는 spread 연산자(*)를 붙여줘야함
    printAll(*array)
}

fun max( a: Int, b: Int): Int{
    return if( a > b ){
        a
    }else {
        b
    }
}

// 위와 동일
fun max2( a: Int, b: Int): Int =
    if( a > b ){
        a
    }else {
        b
    }

// 위와 동일
// return type 생략 가능 - kotlin에서 자동 타입 추론가능하므로
// block이 아니라 =을 썼기 떄문에 생략가능
fun max3( a: Int, b: Int) =  if( a > b ) a else b

// default parameter 사용 가능 (java의 오버로딩 대체가능)
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
){
    for( i in 1..num){
        if( useNewLine ){
            println(str)
        }else{
            print(str);
        }
    }
}

fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}

// 가변인자 (java spread ...)
fun printAll(vararg strings: String){
    for (string in strings) {
        println(string)
    }
}