package todo

import com.sun.xml.bind.v2.TODO
import grails.gorm.transactions.Transactional
import jdk.jfr.Category
import todoCategory.TodoCategory

@Transactional
class TodoService {

    def findAllTodos() {
        try{
            List<Todo> todos = Todo.findAll()
            return todos
        }catch(Exception e){
            throw new Exception(e.toString())
        }
    }

    def findTodosByCategory(int categoryId){
        try{
            def todosCategories = TodoCategory.findById(categoryId)
            ArrayList<Todo> todos = new ArrayList<>()

            for(TodoCategory cat2 in todosCategories){
                todos.addAll(cat2.todos)
            }
            return todos
        }catch(Exception e){
            throw new Exception(e.toString())
        }
    }

    def createNewTodo(Todo todo) {
        try{
            todo.save(flush: true)
        }catch(Exception e){
            throw new Exception(e.toString())
        }
    }

    def updateTodo(Todo todo) {
        try{
            Todo oldTodo = Todo.findById(todo.id)
            oldTodo = todo.save(flush: true)
            return oldTodo
        }catch(Exception e){
            throw new Exception(e.toString())
        }
    }

    def deleteTodo(int id){
        try{
            Todo todoToDelete = Todo.findById(id)
            todoToDelete.delete(flush: true)
        }
        catch (Exception e){
            throw new Exception(e.toString())
        }
    }
}
