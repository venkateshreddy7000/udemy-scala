package Functions

object FunctionsPractises extends App {

  var toInt = new Function1[String , Int] {

    def apply(str: String): Int = str.toInt

  }

  println(toInt.apply("4") + 3)



}
