object Scala_O_O_Session_2 {
  
  class Animal{
		def eat = println("Animals eats")
  }
  
  class Dog extends Animal{
  	def prefferedMeal = println("Milk")
  }
  
//*****************************************************************
  
  abstract class wildAnimal{
  	val creatureType: String
  	def eats
  	def sleep = println("Animals Sleep a lot")
  }
 
  class Tiger extends wildAnimal{
  	val creatureType: String = "Carnivorus"
  	def eats: Unit = println("Eats flesh")
  }

//*****************************************************************
  
  trait Carnivore{
  	def meal
  
  }
  
  trait ColdBlooded
  
  class Crocodile extends wildAnimal with Carnivore with ColdBlooded{
  	val creatureType: String = "Canine"
  	def eats = println("I Eat flesh")
  	def meal = println("I like sea food!")
  }
  
  
  
  

	val tiger = new Tiger                     //> tiger  : Scala_O_O_Session_2.Tiger = Scala_O_O_Session_2$Tiger@621be5d1
	tiger.creatureType                        //> res0: String = Carnivorus
	tiger.eats                                //> Eats flesh

	val dog = new Dog                         //> dog  : Scala_O_O_Session_2.Dog = Scala_O_O_Session_2$Dog@dfd3711
	dog.eat                                   //> Animals eats
	dog.prefferedMeal                         //> Milk

	val croc = new Crocodile                  //> croc  : Scala_O_O_Session_2.Crocodile = Scala_O_O_Session_2$Crocodile@42d3bd
                                                  //| 8b
	croc.eats                                 //> I Eat flesh
	croc.meal                                 //> I like sea food!
}