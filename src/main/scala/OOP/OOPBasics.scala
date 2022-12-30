package OOP

object OOPBasics extends App {

  val person = new Person("john", 26)

  println(person.age)

  person.greet("danial")
  person.greet()
  person.Person("name")

  val writer = new Writer("venky","reddy",1993)
  val novel = new Novel("Life" , 2022 ,writer)

  a(writer.fullName())
  (novel.AuthorAge())
  (novel.isWrittenBy())

}


/// constructor
/// default parameters also work for constructors.
class Person(name: String , val age: Int = 0) {
  //body

  val x = 2 /// vals

  println(x)/// experssions

  def greet(name: String): Unit = println(s"${this.name} says: hi $name")

  def greet(): Unit = println(s"hi says $name")  /// both are same as the function doesn't have same arg as the class , so this key word is not imp
  def greets(): Unit = println(s"hi says ${this.name}")

  ///multiple constructors
  def Person(name: String) = println("MULTIPLE Constructors")


  /// the function greet is overloading as it is same function with different args , if we have same args and diff data type the compiler complains with error.
}
///both age and x are fields which can be accessed in other objects
///class parameters/args are not fields
/// to convert parameters to fields is to add the VAL key word
/// First class is implemented then the object


class Writer (firstName: String , surname: String ,var DOB: Int) {

 def fullName(): Unit = println(firstName +" "+surname)

}


class Novel(name: String, yearOfRelease: Int , author: Writer) {

  def AuthorAge(): Unit=  println(yearOfRelease - author.DOB)
  def isWrittenBy():Unit =println(author.fullName())

}