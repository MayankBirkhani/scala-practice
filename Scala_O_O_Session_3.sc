object Scala_O_O_Session_3 {
	
	case class Person(name:String, age:Int)
	
	//1. Class Parameters are automatically promoted to fields
	val p1 = new Person("Mayank",25)          //> p1  : Scala_O_O_Session_3.Person = Person(Mayank,25)
	println(p1.name)                          //> Mayank
	
	
	//2. case classes have sensible toString
	println(p1.toString)                      //> Person(Mayank,25)
	println(p1)                               //> Person(Mayank,25)
	
	
	//3. Equals and hashcode method implemented already
	val p2 = new Person("Shushant",34)        //> p2  : Scala_O_O_Session_3.Person = Person(Shushant,34)
	println(p1==p2)                           //> false
	
	
	//4. have companion objects already we don't have to create it :- We don't have to use new keyword while making instance of case class
	val p3 = Person.apply("Mohit",24)         //> p3  : Scala_O_O_Session_3.Person = Person(Mohit,24)
	println(p3)                               //> Person(Mohit,24)
	
	val p4 = Person.apply("Harsh",26)         //> p4  : Scala_O_O_Session_3.Person = Person(Harsh,26)
	println(p4)                               //> Person(Harsh,26)
	
	
	//5. case class have a handy copy method
	val p5 = p2.copy()                        //> p5  : Scala_O_O_Session_3.Person = Person(Shushant,34)
	println(p5)                               //> Person(Shushant,34)
	
	val p6 = p5.copy(age=32)                  //> p6  : Scala_O_O_Session_3.Person = Person(Shushant,32)
	println(p6)                               //> Person(Shushant,32)
	println(p6.age)                           //> 32
	
	
	//6. case classes are serializable
	
	//7. when you are using case classes parameters are immutable. Recommended style of spark
	
	
	
	

	
	
	
	
}