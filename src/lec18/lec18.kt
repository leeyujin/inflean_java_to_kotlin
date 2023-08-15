package lec18

fun main(){
    val fruits = listOf(
        Fruit(1, "사과", 1000, 2000)
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // 사과의 가격들
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
//        .mapNotNull { fruit -> fruit.nullOrValue() }
        /*.mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice }*/


    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }
    val hasAnyOver10000 = fruits.any { fruit -> fruit.factoryPrice >= 10000 }
    val count = fruits.count()
    // 오름차순
    val sortedBy = fruits.sortedBy { fruit -> fruit.currentPrice }
    // 내림차순
    val sortedByDescending = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    val distinctFruintNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    fruits.first() // 무조건 null이 아니어야함 (빈리스트인 경우 Exception)
    fruits.firstOrNull() // 첫번째값 또는 null (빈 리스트의 경우 null 반환)

    fruits.last()
    fruits.lastOrNull()

    // key : 과일이름, value : 과일이름 List<Fruit>
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // key : id , value = Fruit
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // key = 과일이름, value = List<출고가>
    val map3 : Map<String, List<Long>> = fruits
        .groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })

    val map4 : Map<Long, Long> = fruits
        .associateBy ( { fruit -> fruit.id } , { fruit -> fruit.factoryPrice } )

    val map5 : Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }


}

private fun filterFruits(
    fruits: List<lec17.Fruit>, filter: (lec17.Fruit) -> Boolean
): List<lec17.Fruit> {
    // 아래 줄을 한줄로 변경 가능
    return fruits.filter(filter)
   /* val results = mutableListOf<lec17.Fruit>()
    for (fruit in fruits) {
        if( filter(fruit) ){
            results.add(fruit)
        }
    }
    return fruits;*/
}
