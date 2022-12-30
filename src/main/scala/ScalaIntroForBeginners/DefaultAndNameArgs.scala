package ScalaIntroForBeginners

import scala.annotation.tailrec

object DefaultAndNameArgs extends App {

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(m: Int , Accumulator: BigInt=1): BigInt =
      if(m<=1) Accumulator else factorialHelper(m-1 , m * Accumulator)
    factorialHelper(n)
    //As we have given a default value , we don't need to give a value for accumulator . if we give its ok else will take default value.

  }


  // here even though we gave a default value to format if we give only other 2 args it will give error as they are int and the compiler will be confused
  // Solution is to write the name of the arg and the value
  def PicturesFormat(format: String="null", lenght: Int ,width: Int): Unit = {

    println(PicturesFormat( lenght=300, width= 500))
  }

}
