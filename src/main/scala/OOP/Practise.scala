package OOP

import java.util.NoSuchElementException

object Practise extends App {

 abstract class MyList[+A]{
   /*
   head = first element of  the  list
   tail = remainder of the list
     isEmpty = is this list empty
     add(int) => new list with this element added
   toString => a string representation of the list
     */

   def head(): A
   def tail(): MyList[A]
   def isEmpty(): Boolean
   def Add[B >: A](x: B): MyList[B]
   def PrintElements(): String
   override def toString : String = "[" + PrintElements() + "]"
 }

  object Empty extends MyList[Nothing]{

    def head(): Nothing = throw new NoSuchElementException
    def tail(): MyList[Nothing] = throw new NoSuchElementException
    def isEmpty(): Boolean = true
    def Add[B >: Nothing](x: B): MyList[B] = new List(x, Empty)
    def PrintElements(): String = ""
  }

  class List[+A](h: A ,t: MyList[A]) extends MyList[A] {

    def head(): A = h
    def tail(): MyList[A] = t
    def isEmpty(): Boolean = false
    def Add[B >: A](x: B): MyList[B] = new List(x ,this)
    def PrintElements(): String = if (t.isEmpty()) "" + h else h + "  " + t.PrintElements()

  }

  var listOfIntegers : MyList[Int] = new List(1, new List[Int](2, new List(3, Empty)))
  var listOfString: MyList[String] = new List[String]("hello" , new List[String]("scala", Empty))

  println(listOfIntegers)
  println(listOfString)


 }














