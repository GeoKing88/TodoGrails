package todo

import grails.converters.JSON
import todoCategory.TodoCategory

class CategoryController {

    static allowedMethods = ['getAllCategories':"GET"]

    def getAllCategories() {
         response.setContentType("application.json")
        try{
            def categories = TodoCategory.findAll()
            response.status = 200
            render categories as JSON
        }catch(Exception e){
            throw new Exception(e.toString())
        }
    }
}
