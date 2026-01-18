package domain.search
enum class SearchStatus(val message: String){
    EMPTY_KEYWORD("Keyword rỗng"),
    SEARCH_SUCCESS("Thành Công"),
    SEARCH_NO_RESULT("Lỗi, không tìm thấy Keyword")
}