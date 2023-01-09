package ScalaIntroForBeginners

object practise1 extends App {

  val writer = new Writer("Venkatesh", "Reddy", 1993)
  val novel = new Novel("Harry Potter", 2022 , author = writer)
  println(writer.Fullname)

  novel.authorAge
  novel.isWrittenBy



}


class Writer(firstname: String , surname: String , var DOB: Int){

  def Fullname : String = surname + firstname

}

class Novel(name: String , yearOfRelease: Int , author: Writer){

  def authorAge: Unit ={
    println(yearOfRelease - author.DOB)
  }

  def isWrittenBy: Unit ={
    println(author.Fullname)
  }
}


