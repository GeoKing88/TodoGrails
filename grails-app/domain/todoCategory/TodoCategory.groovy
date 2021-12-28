package todoCategory

import todo.Todo

import javax.persistence.Id

class TodoCategory {

    static hasMany = [todos : Todo]

    @Id
    Long id

    String name

    Date creationDate

    static constraints = {
        name nullable: false
        creationDate nullable: false
    }

    static mapping = {
        id generator: 'sequence', params: [sequence:"seq_todoCategory"]
    }
}
