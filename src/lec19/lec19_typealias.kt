package lec19

import lec18.Fruit

fun main(){

}


typealias FruitFilter = (Fruit) -> Boolean


//fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {
fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuarianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuarianTribe>