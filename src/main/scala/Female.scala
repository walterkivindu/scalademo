import javacode.{Gender, Person};

case class Female (gender: Gender =Gender.FEMALE) extends Person("John",34){
  def >(person: Female): Boolean = getAge > person.getAge
}
