package OOP

import jdk.nashorn.internal.ir.LiteralNode.PrimitiveLiteralNode

import scala.io.StdIn.{readInt, readLine}


object GeneralPractise extends App {

  val donutName = "Vanilla Donut"
  val quantityPurchased = 10
  val price = 2.50
  val donutJson =
    s"""
       |{
       |"donut_name":"$donutName",
       |"quantity_purchased":"$quantityPurchased",
       |"price":$price
       |}
      """.stripMargin

  val DonutJson = s"""{\n"donut_name":"${donutName}"\n"quantity_purchased":"$quantityPurchased",\n"price":$price\n}"""
  println(DonutJson)

 /* def NameAndAge : Unit = {

    println(Console.UNDERLINED)
    println(Console.BOLD)
    val Name = readLine("Enter the name: ")
    print("Enter the Age: ")
    val Age = readInt()
    println("Name: " + Name)
    println("Age: " + Age)

  }
  NameAndAge*/


  def StrChar(str: String): Char ={
    str.charAt(7)
  }

  println(StrChar("http://allaboutscala.com"))


  def Calculator(X: Int): Unit = {

    val name = "Dolly"
    val CostOfDonuts = 245.5
    val Total = CostOfDonuts * X


    println(f"${name}%s wants donut of cost $$$CostOfDonuts%1.2f and needs 10 of them costing $$$Total%.3f")

  }

  Calculator(10)

  def FavoriteMovie()={

    val Firstname = readLine("Enter the firstname: ")
    val Lastname = readLine("Enter the Lastname: ")
    val Favoritemovie = readLine("Enter the Favorite Movie: ")

    println(s"Firstname: ${Firstname}\nLastname: ${Lastname}\nvenkyFavorite Movie: ${Favoritemovie}")

  }
  FavoriteMovie()
}
