import java.util.Scanner

import services.User

object Main {

  def main(args:Array[String]): Unit =
  {
    println("Welcome to the Admin Panel");
    println()
    println("1. Add User")
    println("2. Remove User")
    val scanner=new Scanner(System.in)
    val option=scanner.nextInt()

    option match{
      case 1 => println("Which User You Want to ADD")
                println("1.Add Student")
                println("2.Add Employee")
                val selectStudent=scanner.nextInt()
                selectStudent match {
                  case 1 => println("Please enter the student name and age: ")
                    val name = scanner.next()
                    val age = scanner.nextInt()
                    val user = new User()
                    user.add(name, age, "student")

                  case 2 => println("Please enter the employee name and age: ")
                    val name = scanner.next()
                    val age = scanner.nextInt()
                    val user = new User()
                    user.add(name, age, "employee")
                  case _ => println("you entered wrong choice")
                }
      case 2 => println("Which User You Want to REMOVE")
                println("1.Remove Student")
                println("2.Remove Employee")
                val selectUser=scanner.nextInt()
                selectUser match{
                  case 1 => println("Please enter the student name ")
                              val name=scanner.next()
                              val user=new User()
                              user.remove(name)
                  case 2 => println("Please enter the employee name ")
                            val name=scanner.next()
                            val user=new User()
                            user.remove(name)
                  case _ =>println("you entered wrong choice")
        }
      case _ =>println("you entered wrong choice")

    }
  }
}
