package todo

import grails.converters.JSON

class TodoController {
    static allowedMethods = [list:"GET", getTodosByCategory:"GET", addNewTodo: "POST", updateTodo: "PUT", deleteTodo: "DELETE"]
    TodoService todoService

    def getAllTodos() {
        response.setContentType("application/json")
        try{
            response.status = 200
            render todoService.findAllTodos() as JSON
        }catch(Exception e){
            response.status = 500
            render(status: response.status, text:e.message)
        }
    }

    def getTodosByCategory(Integer categoryId) {
        try{
            response.status = 200
            render todoService.findTodosByCategory(categoryId) as JSON
        }catch(Exception e){
            response.status = 500
            render(status: response.status, text:e.message)
        }
    }

    def addNewTodo(Todo todo) {
        try{
            todoService.createNewTodo(todo)
            response.status = 200
            render todo as JSON
        }catch(Exception e){
            response.status = 500
            render(status: response.status, text: e.message)
        }
    }

    def updateTodo(Todo todo){
        try{
            todoService.updateTodo(todo)
            response.status = 200
            render todo as JSON
        }catch(Exception e){
            response.status = 500
            render (status: response.status, text: e.message)
        }
    }

    def deleteTodo (int id){
        try{
            _todoService.deleteTodo(id)
            response.status = 200
            render(status: response.status, text: "success")
        }catch(Exception e){
            response.status = 500
            render (status: response.status, text: e.message)
        }
    }
}
