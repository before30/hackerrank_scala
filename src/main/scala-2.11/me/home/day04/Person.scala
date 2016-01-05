package me.home.day04

class Person(age: Int) {
  def amIOld(): Unit = {
    // Do some computations in here and
    // print out the correct statement
    // to the console
    // using System.out.println()...
    if (age < 13) {
      System.out.println("You are young.");
    } else if (age >= 13 && age < 18 ) {
      System.out.println("You are a teenager.");
    } else {
      System.out.println("You are old.");
    }
  }

}

object Person {
  def apply(initial_Age: Int) = {
    val age = initial_Age match {
      case x if x < 0 => {
        println("This person is not valid,setting age to 0.")
        0
      }
      case x => x
    }
  }
}

object Solution {
  def main(args: Array[String]) {
    Person(0)
    Person(-1)
  }
}
