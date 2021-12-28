package validations

import exceptions.ExceptionsUtils
import enums.ExceptionsEnum
import java.sql.Timestamp

class ValidationsService {

    def validateStartEndDates(Timestamp startDate, Timestamp endDate) {
        if(startDate > endDate)
            ExceptionsUtils.defineExceptionEnum(ExceptionsEnum.StartDateGreaterThanEndDate)
    }
}
