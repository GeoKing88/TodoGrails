package todo

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/v1/todo/getalltodos"(controller: "todo", action: "getAllTodos")
        "/api/v1/todo/gettodosbycategory/$categoryId"(controller: "todo", action: "getTodosByCategory")
        "/api/v1/todo/addnewtodo"(controller: "todo", action: "addNewTodo")
        "/api/v1/todo/updatetodo"(controller: "todo", action: "updateTodo")
        "/api/v1/todo/deletetodo/$id"(controller: "todo", action: "deleteTodo")
        "/api/v1/category/getallcategories"(controller: "category", action: "getAllCategories")
    }
}
