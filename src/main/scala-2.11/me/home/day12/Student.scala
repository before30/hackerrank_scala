package me.home.day12

abstract class Student {
  def firstName : String
  def lastName : String
  def phone : String


  def display = {
    println("First Name: "+ firstName)
    println("Last Name: "+ lastName)
    println("Phone: "+ phone)
  }
}

case class Grade(firstName: String, lastName: String, phone: String, score: Int) extends Student {
  def grade: String = {
    score match {
      case s if s < 40 => "D"
      case s if s >= 40 && s < 60 => "B"
      case s if s >= 60 && s < 75 => "A"
      case s if s >= 75 && s < 90 => "E"
      case _ => "O"
    }
  }

  override def display = {
    super.display
    println("Grade: " + grade)
  }
}

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val firstName = sc.next
    val lastName = sc.next
    val phone = sc.next
    val score = sc.nextInt
    val grade = Grade(firstName, lastName, phone, score)
    grade.display
  }
}
