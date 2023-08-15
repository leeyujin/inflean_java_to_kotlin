package lec10.kt

abstract class Animal(
    protected val species : String,
    // property override하려면 'open' 키워드 필요
    protected open val legCount : Int
){
    abstract fun move()
}