package lec20

import lec09.Person
import lec14.kt.PersonDto

fun main(){

    val person = Person("yujin", 100)
    with(person) {
        println(name)
        println(this.age)
    }

    // 하나 이상의 함수를 call chain 결과로 호출 할 때
    val strings = listOf("APPLE", "CAR", "BANANA")
    strings.map { it.length }
        .filter { it > 3 }
//        .let (::println )
        .let { lengths -> println(lengths) }

    // non-null 값에 대해서만 code block을 실행시킬 때
    val str = "abcde"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // 잃회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if( firstItem.length >= 5 ) firstItem else "!$firstItem"
        }.uppercase()
    println(modifiedFirstItem)


    /** run : 객체 초기화와 반환 값의 계산을 동시에 해야할 때 */
    // person만들어서 db에 저장하고, 그 인스턴스를 활용할 때
//    val person3 = Person("yujin", 100).run {
//      hobby = "독서"
//      personRepository.save(this)
//    }

    /** also : 객체를 수정하는 로직이 call chain 중간에 필요할때  */
    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값 : $it" )  }
        .add("four")

    // 위는 아래와 동일한 코드..
    val numbers2 = mutableListOf("one", "two", "three")
    println("four 추가 이전 지금 값 : $numbers2" )
    numbers2.add("four")


}

fun printPerson(person: Person? ){

    // 아래코드 리팩토링
    person?.let {
        println(it.name)
        println(it.age)
    }

  /*  if( person != null ){
        println(person.name)
        println(person.age)
    }*/


}

fun printPerson2(person: Person ){

    // age 반환
    val value1 = person.let{
        it.age
    }

    // it 대신 다른 이름 명명 가능
    val value1_1 = person.let{ p ->
        p.age
    }

    // age 반환
    val value2 = person.run{
        this.age
    }

    // this는 생략가능
    val value2_2 = person.run{
        age
    }

    // value3 = person (객체)
    val value3 = person.also{
        it.age
    }

    // value4 = person (객체)
    val value4 = person.apply{
        this.age
    }
}

/** apply: 객체 설정을 할 때에, 객체를 수정하는 로직이 call chain 중간에 필요할 때 */
// Text Fixture를 만들 때
/*fun createPerson(
    name: String,
    age: Int,
    hobby: String,
): Person {
    return Person(
        name = name,
        age = age,
    ).apply{
        this.hobby = hobby
    }
}*/

// with : 특정 객체를 다른객체로 변환해야하는데
// 모듈간의 의존성에 의해 정적팩토리 혹은 toClass 함수를 만들기 어려울때 사용
/*return with(person){
    PersonDto(
        name = name,
        age = age,
    )
}*/




