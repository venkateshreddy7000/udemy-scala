package ScalaIntroForBeginners

object StringOps extends App {

  val Str: String = "hello, i am learning scala"

  println(Str.charAt(5))
  println(Str.substring(0,5))
  println(Str.split(" ").toList)
  println(Str.startsWith("hello")) // similiarly endswith
  println(Str.replace(",",".")) // similarly we have to lowercase , to uppercase , length

  val aNumberString = "2"
  val aNumber = aNumberString.toInt

  println('a'+: aNumberString:+ 'd' ) // prefix and suffix
  println(Str.reverse)
  println(Str.take(4))

  // Scala - specific : String interpolators

  // S - interpolators

  val name = "venky"
  val age = 30
  val greeting = s"Hello, my name is $name and my age is $age"
  val anotherGreeting = s"Hello, my name is $name and my age is ${ age + 1}"
  println(anotherGreeting)
  println(greeting)


  //F - interpolators

  val speed = 1.5f
  val myth = f"$name can drive $speed%2.2f kmph"
  println(myth)

  // raw - interpolators

  println(raw"this is \n newline") // prints as it is

  val escaped = "this is \n newline"
  println(raw"$escaped")

  //they ignore when given raw or directly , but when injected by variable it gives a newline
}
