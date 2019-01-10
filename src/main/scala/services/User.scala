package services

import entities.{Employee, Student}

class User {

  var studentList: List[Student] = Nil
  var employeeList: List[Employee] = Nil

  def add(name:String, age:Int, typ:String)
  {
    typ match {
      case "student" => val addStudent = new Student(name,age)
                        studentList = studentList :+ addStudent
                        println("Student added")
                        println("student name :"+addStudent.name)
                        println("student age :"+addStudent.age)

      case "employee" => val addEmployee = new Employee(name,age)
                         employeeList = employeeList :+ addEmployee
                         println("Employee added")
                         println("employee name :"+addEmployee.name)
                         println("employee age :"+addEmployee.age)
      case _=> println("Invalid type")
    }

  }
  def remove(name:String): Unit =
  {

  }
}
