package lec10.kt

// convention차이 type 뒤에는 한칸 띄지않고 콜론(:)
// extends를 의미하는 콜론은 한칸 띄고 콜론
class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가")
    }
}