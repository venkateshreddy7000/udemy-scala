package ScalaIntroForBeginners

object CBNvsCBV extends App{


  //we have been using since the start -- here we use the value itself
   def calledByvValue(x: Long): Unit = {

     println("by value " + x)
     println("by value " + x)
   }

  //we don't take the value itself but take as expression/literally and is evaluated only once used(lazy evaluation)
  def calledByName(x: => Long): Unit = {

    println("by name " + x)
    println("by name " + x)

  }
  calledByName(System.nanoTime())
  calledByvValue(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(),34) - gives error
  printFirst(34,infinite()) // doesn't give error as its not used


}