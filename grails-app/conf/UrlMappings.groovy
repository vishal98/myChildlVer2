class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
		
		"/detail/$name/event/$event?" {
			controller = "ghumo"
			action = "showEvents"
		
		}
			"/user/name/$name/email/$email/message/$msg"{
				controller = "ghumo"
				action = "addMessage"
		}
			
			"/blogList/$msg?"{
				controller = "blog"
				action = "getBlogs"
		}
			
			"/name/$name"{
				controller = "teacher"
				action = "getGrade"
		}
			"/homework/"{
				controller = "teacher"
				action = "getHomeWork"
		}
			"/subject/$grade"{
				controller = "teacher"
				action = "getSubject"
		}
			"/Teacher/studentList/$gradeId"{
				controller = "teacher"
				action = "getStudentList"
		}
			
			"/Teacher/sendmessage/"{
				controller = "teacher"
				action = "sendMessage"
		}
			"/accountinfo/$id"{
				controller = "parent"
				action = "accountInfo"
		}
				"/Parent/gethomework/$userId"{
					controller = "parent"
					action = "getHomeWork"
			}
			"/gettodayhomework/$id"{
				controller = "parent"
				action = "getTodayHomeWork"
		}
			
			"/Parent/username/$username"{
				controller = "parent"
				action = "getParentDetails"
		}
			
			"/activity/$activityCode"{
				controller = "ghumo"
				action = "getActivityDetail"
		}
			
			"/Teacher/id/$userId"{
				controller = "teacher"
				action = "getTeacherDetails"
		}
			
			"/Parent/studentId/$stdid/teacher/$classid"{
				controller = "parent"
				action = "getHomeWork"
		}
			"/Teacher/msg"{
				controller = "teacher"
				action = "getMsg"
		}
			"/App/exam/$classid"{
				controller = "parent"
				action = "getExamDetails"
		}
			"/Parent/child/schedule/$examId"{
				controller = "parent"
				action = "getExamSchedule"
		}
			"/Parent/child/syllabus/$examId/$scheduleId"{
				controller = "parent"
				action = "getSyllabus"
		}
			"/Teacher/grade/$grade/username/$username"{
				controller = "teacher"
				action = "getSubject"
		}
			
		// NEW ADDED APIS


		"/app/timetable/$gradeId"
				{
			controller = "TimeTable"
			action = "getWeekTimetable"

		     }

		"/app/timetable/$gradeId/$section/$day"
				{
					controller = "TimeTable"
					action =  "getDayTimeTable"
				}




        "/app/parent/accountInfo/$id"
				{
					controller = "Guardian"
					action = "getAccountInfo"
				}

		"/app/getHomework/$gradeId/$section"
				{
					controller = "Homework"
					action = "getClassHomework"

				}
		"/app/getHomework/$gradeId/$section/$subject"
				{
					controller = "Homework"
					action = "getClassHomeworkBySubject"

				}

		"/app/teacher/homework"(resources:"Homework")


		"/app/parent"(resources : "guardian")

		"/app/student"(resources : "student")




		"/app/teacher/homework/save"
		{
			controller = "Homework"
			action = "saveHomework"
		}




	}
			 
			
	
}
