package org.scalapractice.functional

class car{
  // class is defined as a collection of variables and methods
  // Scala doesnot have a static keyword
  // There are three levels of access modifiers
  // public - which can be accessed anywhere
  // private  - which can be accessed in the same class where it is defined
  // protected - which can be accessed in the same class and subclass inheriting the parent class

  var roadTax = 100
  var topClassExtraCost = 0
  private var gstCost = 0.1

  def checkGst = gstCost
  def totalcost(basicCost:Int) = basicCost + topClassExtraCost + roadTax + gstCost * basicCost

}


object classObjectDemo {
  def main(args: Array[String]): Unit = {
  // All methods defined in an object are bydefault static which means it can be invoked without creating a instance
    println("Object to understand the scope of variables and methods in class and objects")

    // creating a instance of a class
    val bmw = new car
    // Public variables can be accessed as shown below
    bmw.roadTax = 200
    println("Total cost of the bmw car is "+ bmw.totalcost(10000))

    val audi = new car
    // Trying to access the private member of ar class, it gives an error stating its inaccessible
    //audi.gstCost = 10
    // inorder to access the private members, just create a function in car member and return the private member variable as shown below
    println("GST for a car is "+ audi.checkGst)
    println("Total cost of an Audi car is " + audi.totalcost(20000))

  }
}
