package OOP

object OOPBasics extends App {

  val person = new Person("john", 26)

  println(person.age)

  person.greet("danial")
  person.greet()
  person.Person("name")

  val writer = new Writer("venky","reddy",1993)
  val imposter= new Writer("venky","reddy",1993)
  val novel = new Novel("Cricket",2022 , writer.FullName())
  val counter = new Counter(10)

  counter.currentCount()
  println(counter.CurrentCount())
  counter.Increment(counter)
  counter.Decrement(counter)
  println(counter.increment(counter))
  println(counter.decrement(counter))

  println(counter.Increment())
  println(counter.Decrement())


  writer.fullName()
  println(writer.FullName())

  novel.AuthorAge()
  println(novel.authorAge())



  novel.IsWrittenBy()
  println(novel.isWrittenBy())



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


class Writer(firstname: String,surname: String,val DOB: Int) {

  def fullName(): Unit = {

    println(firstname + " " + surname)
  }

  def FullName(): String = firstname + " " + surname
}

class Novel(name:String ,yearOfRelease: Int,Author: String){

  val writer = new Writer("Venky","reddy",1993)

  def authorAge(): Int = yearOfRelease - writer.DOB

  def AuthorAge(): Unit = println(yearOfRelease - writer.DOB)

  def isWrittenBy(): String = writer.FullName();

  def IsWrittenBy(): Unit = println(writer.fullName())
}

class Counter(val value : Int = 0) {

  def currentCount(): Unit = println(value)
  def CurrentCount(): Int = value

  def increment(Value: Counter): Int = (value) + 1
  def decrement(Value: Counter): Int = (value) - 1

  def Increment()= new Counter(value + 1)
  def Decrement()= new Counter(value - 1)

  def Increment(Value: Counter): Unit = println((value) + 1)
  def Decrement(Value: Counter): Unit = println((value) - 1)

}