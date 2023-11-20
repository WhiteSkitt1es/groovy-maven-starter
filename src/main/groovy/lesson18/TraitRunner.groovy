package lesson18

class TraitRunner {
    static void main(String[] args) {
        def person = new Person(name: "Pavel", id: 1)
        println person

        person.properties.each {println it}
    }
}
