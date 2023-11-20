package lesson18

trait WithId {
    Integer id

    boolean validateId(Integer id) {
        return this.id == id
    }
}
