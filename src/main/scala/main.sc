import javacode.{Person}

object main{

  val person1:Female = Female()
  var person2:Female = Female()

  var isOlder  = person1 > person2
  println(isOlder)

  private val persons = List(new Person("John", 3), new Person("John2", 34))
  private val (below,above) = persons.partition(persons => persons.getAge < 18)
  println("Below" + below)
  println("Above" + above)

}
