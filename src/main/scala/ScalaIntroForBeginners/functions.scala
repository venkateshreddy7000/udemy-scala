package ScalaIntroForBeginners

import scala.annotation.tailrec

object functions extends App{

  def afunction(a: String , b: Int): String =

    a + " " + b
 println(afunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)
  // parameterless function can be called without parenthesis




  def aRepeatedFunction (astring: String , n: Int): String = {

    if(n == 1) astring else astring + aRepeatedFunction(astring,n-1)
  }
  println(aRepeatedFunction("hello",3))



  //when you need loops , use recursion functions IMP

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)


  //------------------------------------------------------------------------------------------------------------


  //ex - 1
   def Greeting(greet: String, age: Int): Unit = println("Hi, my name is " + greet + " and i am " + age + " years old.")

  Greeting("venky" , 29)

  //ex -2
  def Factorial(n: Int): BigInt =
    if(n <=0 ) 1 else n*Factorial(n-1)

  println(Factorial(2000))


  //ex - 3

  def Fibonacci(n: Int ): Int = {

    if (n <= 2) 1 else Fibonacci(n - 1) + Fibonacci(n - 2)

  }

  println(Fibonacci(9))


  //ex - 4
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(m: Int): Boolean = {
     if(m<=1) true
     else (n % m != 0) && isPrimeUntil(m-1)
    }

    isPrimeUntil(n/2)
    }


  println(isPrime(37))
  println(isPrime(34))
}


/// Type Inferences - compiler understands the return type for a val , var and functions , except for recursive functions.