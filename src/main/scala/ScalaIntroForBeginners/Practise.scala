package ScalaIntroForBeginners

import scala.annotation.tailrec

object Practise extends App{

  def Factorial(x: Int): Int={
    if (x<=1) 1 else x*Factorial(x-1)

  }

  println(Factorial(4))

  def Fabonacci(x: Int): Int = {
    if(x<=2) 1 else Fabonacci(x-1) + Fabonacci(x-2)
  }

  println(Fabonacci(7))

  def Primenumber(x: Int): Boolean ={
    def primehelper (y: Int): Boolean=
      if (y<=1) true
      else x%y != 0 && primehelper(y-1)

    primehelper(x/2)
  }
  println(Primenumber(27))


  def aRepeatedFunction (astring: String , n: Int): String = {
    @tailrec
    def Repeathelper(acc: String,m: Int): String =
      if (m<=1) acc else  Repeathelper(acc.concat(astring) , m-1)
    Repeathelper(astring,n)

  }
  println(aRepeatedFunction("hello",3))

  def anotherFactorial(x: Int): Int ={
    @tailrec
    def FactorialHelper(y: Int,acc: Int): Int =
      if (y<=1) acc else FactorialHelper(y-1 , y*acc)

    FactorialHelper(x, 1)
  }

  println(anotherFactorial(5))

  def anotherfabonacci(x: Int): Int ={
    def fabonacciHelper(y: Int , acc: Int): Int =

      if (y<=2) acc else fabonacciHelper(y-1 , y + acc)

              fabonacciHelper(5,1)
  }


}
