package lec11

//protected val a : Int = 10
val a : Int = 10

// 클래스에 접근지시어 붙이려면 constructor 붙여야
open class Cat protected constructor()


// getter 3개 : name, owner, _price
// setter 2개 : owner, _price
class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
){
    var price = _price
        private set
}