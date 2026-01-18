package domain.resgister

enum class RegisterStatus(val message: String){
    INVALID_INPUT("email hoặc password hoặc confirmPassword Rỗng"),
    PASSWORD_NOT_MATCH("password không giống với confirmPassword"),
    EMAIL_EXIST("Email đã tồn tại"),
    SUCCESS("Thành Công")
}