package lec15

fun main(){

    /** array */
    val array = arrayOf(100, 200)

    array.plus(300)

    for( i in array.indices){
        println("${i} ${array[i]}")
    }

    for( (idx, value) in array.withIndex() ){
        println("$idx $value")
    }

    for (data in array) {
        println(data)
    }

    /** list */
    // 불변리스트
    var numbers = listOf(100, 200)

    // 가변리스트
    var numbersM = mutableListOf(100, 200)
    numbersM.add(300)


    // 타입 명시해줘야함
    val emptyList = emptyList<Int>()

    println(numbers[0])
    for (number in numbers) {
        println(number)
    }

    for( (idx, value) in numbers.withIndex() ){
        println( "$idx $value")
    }

    for( i in 0..numbers.size ){
        println(numbers[i] )
    }

    /** set */
    val set = setOf(100, 200)
    val mutableSet = mutableSetOf(100, 200)
    mutableSet.add(300)

    /** map */
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for( key in oldMap.keys ){
        println( oldMap.get(key) )
        println( oldMap[key] )
    }

    for( (key, value) in oldMap.entries ){
        println("$key $value")
    }


}