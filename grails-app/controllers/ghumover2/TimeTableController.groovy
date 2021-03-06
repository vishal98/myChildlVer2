package ghumover2

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured
import grails.rest.Resource
@Resource


@Secured(['ROLE_TEACHER','ROLE_PARENT'])
class TimeTableController {

   // static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]



    def getWeekTimetable()
    {


             def grade = Grade.findByName(params.gradeId)
             def response =  TimeTable.findAllByGrade(grade)
             render response as JSON
    }


    def getDayTimeTable()
             {

                 def day = params.day
                 def section = params.section
                 def grade = Grade.findByNameAndSection(params.gradeId,params.section)
                 def result = TimeTable.findAllByGradeAndDay(grade,day)
                 render result as JSON



             }

}
