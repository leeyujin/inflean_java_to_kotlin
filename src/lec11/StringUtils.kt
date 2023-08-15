package lec11

// 직접 파일에 유틸성코드를 작성해서 사용하는것이 편한다
fun isDirctoryPath(path: String): Boolean {
    return path.endsWith("/")
}

