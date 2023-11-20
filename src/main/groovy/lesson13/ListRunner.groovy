package lesson13

class ListRunner {
    static void main(String[] args) {
        def list = [1, 2, 3, 4, 5]
        println list.getClass() == ArrayList

//        read
        assert list[2] == 3
        assert list.get(2) == 3
        assert list[-1] == 5
        assert list[1..3] == [2, 3, 4]
        assert list[8] == null

//        write
        list += 9
        list << 11 << 13
        assert list == [1, 2, 3, 4, 5, 9, 11, 13]
        list -= 13
        assert list == [1, 2, 3, 4, 5, 9, 11]
        list -= [1, 2]
        assert list == [3, 4, 5, 9, 11]
        list *= 3
        assert list == [3, 4, 5, 9, 11, 3, 4, 5, 9, 11, 3, 4, 5, 9, 11]

//        method from queue
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 3
        assert list.tail() == [4, 5, 9, 11, 3, 4, 5, 9, 11, 3, 4, 5, 9, 11]
        assert list.last() == 11

//        flatten, reverse, intersect, disjoint
        assert [1, 2, [3, 4, 5], 6].flatten() == [1, 2, 3, 4, 5, 6]
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 4].disjoint([5, 6, 7])

//        new operators
        def (a, b, c) = [1, 2, 4]
        assert a == 1
        assert b == 2
        assert c == 4
        func(*[1,2])
    }

    static def func(def a, def b) {
        println a
        println b
    }
}
