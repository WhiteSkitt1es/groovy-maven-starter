package lesson11;

class SwitchRunner {
    static void main(String[] args) {
        int x = 12
        // byte, short, int, char, String, enum
        switch (x) {
            case String:
                println 0
                break
            case 5:
                println 1
                break
            case ~/\d+/:
                println 2
                break
            case {it % 5 == 0}:
                println 3
                break
            case [1, 2 ,3 ,4]:
                println 4
                break
            default:
                println "None"
                break
        }
    }
}
