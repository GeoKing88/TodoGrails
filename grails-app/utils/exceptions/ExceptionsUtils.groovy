package exceptions

import enums.ExceptionsEnum

class ExceptionsUtils {

    static def defineExceptionEnum(ExceptionsEnum exceptionEnum) {
        switch (exceptionEnum){
            case ExceptionsEnum.StartDateGreaterThanEndDate :
                return "The start Date is Greater than end Date."
            default:
                throw new Exception("No Exception mapped")
        }
    }
}

