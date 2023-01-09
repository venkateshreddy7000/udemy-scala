package Functions

object FunctionPractise extends App {

  var toInt = new Function1[String , Int]  {

      def apply(string: String) = string.toInt

  }

  print(toInt.apply("4") + 3)
}

