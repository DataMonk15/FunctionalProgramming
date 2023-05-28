package Objects
/*
* Singleton Objects
* creation of instance is not possible for singleton objects
* methods and variables defined inside the object are accessible globally
* variables defined inside the main method are not accessible in any other object
* to access the methods and variables, we use dot members name
* */

object summing{
  val a = 10
  val b = 20
  def print(): Unit = {
    println(s"Sum of 2 numbers are ${a} and ${b} is " + (a + b ))
  }
  println(singletonDemo.x)
  // variables and methods defined inside the main class of a object are not accessible inside a singleton object
  //println(singletonDemo.toStringdemo())
}
object singletonDemo {
  val x = 20
  def main(args: Array[String]): Unit = {
    val x = 20
   def toStringdemo(): Unit = {
     println(s"Method to try to access the members from inside a main method are ${x}")
   }
    println(summing.print())
  }
}
