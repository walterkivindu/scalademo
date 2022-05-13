import javacode.{Gender, Person}

object Main {
  def main(args: Array[String]): Unit = {

    val person1: Female = Female()
    person1.setAge(56)
    val person2: Female = Female()
    person2.setAge(88)

    val isOlder = person1 > person2
    println(isOlder)

    val persons = List(new Person("John", 3), new Person("John2", 34), new Person("Martin", 35))
    val (below, above) = persons.partition(persons => persons.getAge < 18)
    println("Below " + below)
    println("Above " + above)
  }
}