package lec10.kt

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 움직임")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

 /*   override val swimAbility: Int
        get() = 3*/

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }


}