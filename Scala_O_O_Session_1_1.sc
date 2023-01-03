object Scala_O_O_Session_1_1 {

	object Person{
		
	//class level Functionality same like "static" in Java
		val N_Eyes = 2
		def canFly: Boolean = false
	
	}
	println(Person.N_Eyes)                    //> 2
	println(Person.canFly)                    //> false

	class Person(val name: String, val age:Int){
	//Instance level functionality
	
		def salaryDoubler(salary:Int) = salary * 2
	
	}
	
	// companions
	val person1 = new Person("Mayank",25)     //> person1  : Scala_O_O_Session_1_1.Person = Scala_O_O_Session_1_1$Person$1@3fb
                                                  //| 6a447
  val person2 = new Person("Shushant", 32)        //> person2  : Scala_O_O_Session_1_1.Person = Scala_O_O_Session_1_1$Person$1@79b
                                                  //| 4d0f
  

}