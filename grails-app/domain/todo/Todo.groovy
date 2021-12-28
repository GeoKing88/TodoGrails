package todo

import grails.databinding.BindingFormat
import todoCategory.TodoCategory

import javax.persistence.Id
import java.sql.Timestamp

class Todo {

    @Id
    Integer id

    String name

    @BindingFormat("yyyy-MM-dd")
    Date creationDate

    boolean isCompleted


    static belongsTo = [todo_category: TodoCategory]

    static constraints = {
        name nullable: false
        creationDate nullable: false
        isCompleted nullable: false
    }

    static mapping = {
        id generator: 'sequence', params: [sequence:"seq_todo"]
    }
}
