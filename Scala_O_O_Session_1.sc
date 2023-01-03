object Scala_O_O_Session_1 {

class Person(name:String, age:Int){   //Also called as Constructor

val x = 20

def ageDoubler = age * 2

def salaryDoubler(salary:Int) = salary * 2

}

val person = new Person("Mayank",25)   						//person-> is the instance of class
                                                  //> person  : Scala_O_O_Session_1.Person = Scala_O_O_Session_1$Person@621be5d1
																									// Person -> is the class name
println(person.x)                                 //> 20
println(person.ageDoubler)                        //> 50
println(person.salaryDoubler(20000))              //> 40000




}