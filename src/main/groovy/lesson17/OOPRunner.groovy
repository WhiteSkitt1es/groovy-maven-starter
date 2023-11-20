package lesson17

class OOPRunner {
    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Pavel" // setFirstName
        println student.firstName // getFirstName
        println student["firstName"]
        println student."firstName"
        println student.@firstName // not recommended

        def student1 = new Student(firstName: "Pavel", lastName: "Artem'yev", age: 26)
        println student1

        Student student2 = ["Kirill", "Artem'yev", 25]
        println student2

        def (fn, ln) = student2
        println fn
        println ln

        assert [student1, student2].collect {it.firstName} == ["Pavel", "Kirill"]
        assert [student1, student2]*.firstName== ["Pavel", "Kirill"]
    }
}
