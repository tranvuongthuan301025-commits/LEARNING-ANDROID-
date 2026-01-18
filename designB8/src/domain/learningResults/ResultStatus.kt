package domain.learningResults

enum class ResultStatus(val message: String){
    RESULT_PASS("Thành Công"),
    RESULT_FAIL("Lỗi"),
    RESULT_INVALID("Rỗng"),
}