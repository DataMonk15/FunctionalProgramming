package Objects
/*
* When a class and objects with same name are defined then class is called companion class and object as companion
* object.
* variables and methods defined outside the main function can be accessed in class using objectname with dot operators
* Instance of companion class can be created using new keyword
* */
class companionClass(x:Int,y:Int) {
  val a = x
  val b = y
  def Multiplyvar(): Unit = {
    println(s"printing the variables defined in companionClass ${a} and ${b}")
  }
  // Trying to access the companion variables and methods
  companionObjects.x = 15
  println(s"Trying to modify the variables defined in companion object ${companionObjects.x}")
}

object companionObjects{
  var x = 10
  var y = 21
  def main(args: Array[String]): Unit = {
    val c1 = new companionClass(x = x, y =y)
    c1.Multiplyvar()
  }
}