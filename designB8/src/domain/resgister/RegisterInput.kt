package domain.resgister

data class RegisterInput(
    val email: String,
    val password: String,
    val confirmPassword: String
)