package domain.login
enum class LoginStatus(val message: String){
    LOGIN_EMPTY("Email Hoặc Password Rỗng"),
    LOGIN_ERROR("Email Hoặc Password Lỗi"),
    LOGIN_SUCCESS("Đăng Nhập Thành Công"),
}