package ScalaIntroForBeginners

import ScalaIntroForBeginners.functions.Greeting

import scala.annotation.tailrec

object Recursions extends App {



  def Factorial(n: Int): Int = {

    if (n <= 1) 1 else n * Factorial(n - 1)
  }



  def anotherFactorial(n: Int): BigInt = {
  @tailrec
    def factorialHelper(m: Int , Accumulator: BigInt): BigInt =
      if(m<=1) Accumulator else factorialHelper(m-1 , m * Accumulator)

    factorialHelper(n ,1 )
  }


  println(Factorial(10))
  // println(Factorial(7000)) // stackoverflow error ie stack memory is not enough
  println(anotherFactorial(10))
  println(anotherFactorial(20000))


 /* anotherFactorial(10) = factorialHelper(10,1)
    =factorialHelper(9,10*1)
    =factorialHelper(8,9*10*1)
    =factorialHelper(7,8*9*10*1)
    .
  .
  .
  .
  =factorialHelper(2,3*.....7*8*9*10*1)
  =factorialHelper(1,2*3*.....7*8*9*10*1)
  =Accumulator = 2*3*.....7*8*9*10*1  ***** Which is the factorial of 10 and now multiplies and no intermediate values to consume stack memory.
  */

  // If you need loops then USE TAIL RECURSIVE .

//ex - 1


  def atailrecursiveFibonacci(n: Int ): Int = {
    def FibHelper(m: Int , Accumulator: Int): Int = {
    if (m <= 2) 1 else FibHelper(m-1,m+Accumulator)

    }
    FibHelper(n , 1)
  }

  println(atailrecursiveFibonacci(9))

}




