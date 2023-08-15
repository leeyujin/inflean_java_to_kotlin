package lec14.kt

fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    code: String
){
    KOREA("KO"),
    AMERICA("US"),
    CHINA("CN")
}