package ScalaIntroForBeginners

object valuesVariablesAndDatatypes extends App{


  // VALS ARE IMMUTABLE
  val x: Int = 42
  println(x)
  println("val can't be reassigned")


  // COMPLIER IS SMART ENOUGH AND CAN INFER THE DATA TYPES
  val y = 15
  println(y)
  println("without declaration of datatype still works")


  val astring: String = "hello world"
  val bstring: String = "good bye"

  val aBoolean: Boolean = false
  val achar: Char = 'a'
  val aInt: Int = x
  val ashort: Short = 2345
  val along: Long = 45678889L
  val afloat: Float = 6575.65f
  val adouble: Double = 5643.89665


  //variables
  //they are mutable
  var z: Int = 5
  z = 10 // side effects

}
