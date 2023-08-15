package lec17

fun main(){
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )

    // 람다를 만드는 방법 1
    // 이름없는 함수 'fun함수이름'형태여야
    val isApple = fun(fruit: Fruit): Boolean{
//    val isApple : (Fruit) -> Boolean = fun(fruit: Fruit): Boolean{
        return fruit.name == "사과"
    }


    // 람다를 만드는 방법 2
//    val isApple2 : (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 람다를 직접 호출하는 방법1
    isApple(fruits[0])
    // 람다를 직접 호출하는 방법2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)

    // 아래 4줄은 모두 동일한 결과
    filterFruits(fruits, isApple2)
//    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
//    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과" }

}
    // Predicate 대신
    private fun filterFruits(
        fruits: List<Fruit>, filter: (Fruit) -> Boolean
    ): List<Fruit> {
        val results = mutableListOf<Fruit>()
        for (fruit in fruits) {
            if( filter(fruit) ){
                results.add(fruit)
            }
        }
        return fruits;
    }




