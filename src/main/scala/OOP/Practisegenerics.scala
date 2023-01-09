package OOP

object Practisegenerics extends App{



 /* class SuperList[A]

  class MyList[+A] {
    def dog[B >: A](x: B): MyList[B] ={
       println("bow bow")
      MyList.this
    }
    def Add:MyList[A] = {
      println(2 + 3)
      MyList.this

    }
  }

  var animal = new MyList[String]

  var add = new MyList[Int]

  println(animal.dog())
  println(animal.Add)

  println(add.Add)
  add.dog() */


  abstract class Numbers[+A]{
    def Addition[B >: A](x: B , y: B): B
    def Subtraction[B >: A](x: B , y: B): B
    def isPositive: Boolean
    def isNegative: Boolean
    def Multiple[B >: A](x: B , y: B): B

  }

  class positivesNumbers[+A](x: A , y: A) extends Numbers[A]{

    def Addition[B >: A](x: B , y: B): Int =  x+y
    def Subtraction[B >: A](x: B , y: B): B = ???
    def isPositive: Boolean = true
    def isNegative: Boolean = false
    def Multiple[B >: A](x: B , y: B): B = ???


  }
  class NegativeNumbers[A](x: A,y: A) extends Numbers[A]{

    def Addition[B >: A](x: B , y: B): B = ???
    def Subtraction[B >: A](x: B , y: B): B = ???
    def isPositive: Boolean = true
    def isNegative: Boolean = false
    def Multiple[B >: A](x: B , y: B): B = ???
  }

  var positive: Numbers[Int] = new positivesNumbers[Int]

  positive.Addition(4 , 6)

  abstract class Car {
    def apply : Unit
    def apply2: Unit
  }


  class Practisegenerics$$anon$1 extends Car {

    def apply : Unit = {
      println("ALL kinds of cars")
    }
    def apply2: Unit = {
      print("successful")
    }
  }

  var car = new Practisegenerics$$anon$1()

 /* var car = new Car {
        def apply : Unit = {
           println("ALL kinds of cars")
     }
 }
  */

  println(car.getClass)
}
