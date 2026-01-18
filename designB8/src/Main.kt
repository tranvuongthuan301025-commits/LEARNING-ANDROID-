import domain.resgister.RegisterInput
import domain.learningResults.ResultUseCase
import domain.login.LoginUseCare
import domain.resgister.RegisterUseCare
import domain.listStudent.ListStudentUseCare
import domain.studentDetails.SearchStudentsUseCare
import domain.listObject.ListObjectUseCare
import domain.download.DownloadUseCare
import domain.search.SearchUseCare

import data.UserAccount
import data.Student
import data.Course
fun main(){
//    Bài 1
    val login: LoginUseCare = LoginUseCare
    val name = UserAccount("admin","123")
    login.checkLogin(name){status->
        println(status.message)
    }

//    Bài 2
    val user1 = RegisterInput("a@gmail", "thuan", "thuan")
    val listEmail = listOf(
        "a@gmail.com",
        "b@gmail.com"
    )
    RegisterUseCare.register(user1, listEmail){ status->
        println(status.message)
    }

//    Bài 3
    val sinhVien: List<Student> = listOf(
        Student(1111, "thuan", 10.0),
        Student(1111, "thuan", 10.0),
        Student(1111, "thuan", 10.0)
    )
    ListStudentUseCare.getStudentListStatus(sinhVien){status ->
        println(status.message)
    }
//    Bài 4
    val students: List<Student> = listOf(
        Student(1221, "Thuan", 5.0),
        Student(121, "Hung", 5.0),
        Student(11, "Hieu", 5.0),
    )
    SearchStudentsUseCare.findStudentDetail(students, 121){ status,it->
        println(status.message)
        println("${it?.id}, ${it?.name}, ${it?.score}")
    }
//    Bài 5
    ResultUseCase.evaluateScore(11.0){status->
        println(status.message)
    }
//    Bài 6
    val studens: List<Course> = listOf(
        Course("32323", "Thuan"),
        Course("32323", "Thuan"),
        Course("32323", "Thuan"),
    )
    ListObjectUseCare.getCourseListStatus(studens){status->
        println(status.message)
    }
//    Bài 7
    DownloadUseCare.download(300){status->
        println(status.message)
    }
//    Bài 8
    val studen: List<String> = listOf(
        "abc",
        "thuan",
        "Hung"
    )
    SearchUseCare.search("sdvsdv", studen){status->
        println(status.message)
    }
}