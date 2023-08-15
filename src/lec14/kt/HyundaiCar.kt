package lec14.kt

fun main(){
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar){
    when( car ){
        is Avante -> println("아반떼")
        is Grandeur -> println("소나타")
        is Sonata -> println("그렌저")
    }
}

// 컴파일 타임 때 하위클래스 타입을 모두 기억한다
// 런타임때 클래스 타입이 추가될 수 없다
// -> 추상화가 필요한 Entity or DTO에 sealed 활용
sealed class HyundaiCar(
    val naem: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)