package lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
//        read
        def file = new File(".gitignore")
        println file.text

        file.each { line -> println line}
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }
        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

//        write
        def file1 = new File("text.txt")
        file1.text = "Some text"
        file1 << "New line" << System.lineSeparator()
//        file1.withOutputStream {}
//        file1.newOutputStream()

        def srcDir = new File("src")
        srcDir.eachDir {println it}
        srcDir.eachDirRecurse {println it}

        srcDir.eachFile (FileType.FILES) {println it}
    }
}
