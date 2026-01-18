package domain.download
enum class DownloadStatus(val message: String){
    DOWNLOAD_ERROR("Lỗi"),
    NETWORK_ERROR("Mạng Lỗi"),
    DOWNLOAD_TIMEOUT("Hệ thống đang Lỗi"),
    DOWNLOAD_SUCCESS("Thành Công"),
}