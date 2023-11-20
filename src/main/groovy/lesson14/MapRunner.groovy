package lesson14

class MapRunner {
    static void main(String[] args) {
//        def map = [:]
        def map = ["one": 1, "two": 2]
        assert map.getClass() == LinkedHashMap

//        read
        assert map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        assert map.get("qwe", 10) == 10

//        write
        map."one" = 111
        map."tree" = 3

//        new method
        assert map.subMap("one", "two") == ["one": 111, "two": 2]

//        new operator
        def newMap = ["q": 1, "w": 2, *:map]
        println newMap
    }
}
