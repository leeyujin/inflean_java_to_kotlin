package lec13

class House(
    private val address: String,
    private val livingRoom: LivingRoom
){

    // 바깥클래스 참조 시
    inner class LivingRoom(
        private val area: Double
    ){
        val address: String
            get() = this@House.address
    }
}