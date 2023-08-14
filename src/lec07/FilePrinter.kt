package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    // java와 달리 CheckedException을 throws하는 구문을 추가하지 않아도 됨
    // kotlin은 모두 Unchecked Exception으로 간주함
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // try with resources가 없다 -> use로 대체
    // 코틀린의 언어적 특징을 활용해 close를 호출해준다
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }


}