package lesson9

import org.apache.groovy.internal.util.Function

import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
        Function<Integer, Integer> func = value -> Math.sqrt(value)
        def result = func.apply(5)
//        println result

//        Closure closure = {value -> value + value}
//        def res = closure.call(5)
//        println res
//        println closure(5)

        Closure closure = {
            value = 5 ->
            value + value
        }
        println closure()

//        println closure(5)

        Stream.of(1, 2, 3)
            .map(value -> Math.sqrt(value))
            .map(String::valueOf)
            .map(value -> value[0])
            .forEach(System.out::println)

        int x = 10
        check(x > 0, {println x})
    }

    static def check(boolean condition, Closure closure) {
        if(condition) {
            closure()
        }
    }
}
