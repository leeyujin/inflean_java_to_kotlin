package lec19

import lec19.a.printHelloWorld as printHelloWorldA
import lec19.b.printHelloWorld as printHelloWorldB

// 이름이 같은 서로 다른 패키지의 두 함수 가져올때
fun main(){
    printHelloWorldA()
    printHelloWorldB()
}
