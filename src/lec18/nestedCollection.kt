package lec18

fun main(){

    val fruitsInList: List<List<Fruit>> = listOf (
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(5L, "바나나", 3_000, 3_200),
            Fruit(6L, "바나나", 3_200, 3_200),
            Fruit(7L, "바나나", 2_500, 3_200),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000)
        )
    )

    // 출고가와 현재가가 동일한 과일을 골라주세요
    // flatMap -> list + list 가 단일 List로 바뀜
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    // 위 내용 리팩토링
    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }

    // 중첩 컬랙션 중첩 해제
    fruitsInList.flatten();

}
// 확장함수 생성
val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)