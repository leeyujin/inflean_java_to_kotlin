package lec19

fun main(){
    val numbers = listOf(1,2,3)

//    numbers.map { it + 1}
//        .forEach { println(it) }
    numbers.map { number -> number + 1}
        .forEach { number -> println(number) }

    run{
        numbers.forEach { number ->
            if( number == 2) {
                return@run
            }
        }
    }

    numbers.forEach { number ->
        if( number == 2) {
            return@forEach // continue와 같은 효과
        }
    }

    abc@ for( i in 1..100 ){
        for (j in 1..100){
            if(j==2){
                break@abc
            }
            println("${i} ${j}")
        }
    }


}
