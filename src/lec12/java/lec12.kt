package lec12.java

fun main(){
    // 익명클래스
    moveSomething( object : Movable {
        override fun move() {
            println("무브무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()

}