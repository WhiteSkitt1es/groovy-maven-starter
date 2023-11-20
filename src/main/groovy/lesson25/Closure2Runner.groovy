package lesson25

import lesson17.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            firstName = "Petr"
        }

        println closure.thisObject
        println closure.owner
        println closure.delegate

        def student = new Student("Pavel", "Artem'yev", 26)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()
        student.with closure

        println student
    }
}
