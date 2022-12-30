package ScalaIntroForBeginners

object expressions extends App{

  val x = 1+2 // EXPRESSIONS
  println(x)
  println(2+3*4) // BODMAS - brackets order division multi add sub...

  println(x==1) //Expression comparation
  // == != > >= < <=

  println(!(1==x))
  // ! && || ---> booleans

  var y = 2
  y+=3 // y=y+3 also works for y-=3 , y*=3 , y/=3......side effect

  //INSTRUCTIONS(to do) VS EXPRESSIONS(value)

  //if expressions

  val acondition = true
  val aconditionvalue = if(acondition) 5 else 3

  println(aconditionvalue)

  // loops not recommanded
  // NEVER WRITE AGAIN
  var i = 0
  val awhile = while(i<=10)
    {
      println(i)
      i+=1
    }

//everything in scala is expression

  val aweirdvalue = (y = 3) //unit return === void (don't return anything meaningful) . this reassigning

  //side effects while loops , reassigning , println() - these expression returning unit


  //code block
  //these are expressions
  // y and z are defined only in code block, not valid outside
  val aCodeBlock = {
    val y = 2
    val z = y+1

    if(z>2) "hello" else "bye"

  }


}
