package lesson10

class ConditionRunner {
    /**
     * boolean          is true
     * Collection/Map   is not empty
     * Matcher          has match
     * String/GString   is not empty
     * Number/Char      != 0
     * reference        != null
     *
     * asBoolean
     */
    static void main(String[] args) {
        int x = 10
        boolean booleanResult = x > 0
        if(booleanResult) {
            println x
        }
        Person person = new Person(9);
        if (person) {
            println person.getId()
        }
    }
}
