//*******************Function Implementation*******************

object Scala_Basic_3 {

	//Square Function Implementation
  def squareIt(x : Int):Int={
  		x*x
  }                                               //> squareIt: (x: Int)Int
  
  println(squareIt(10))                           //> 100

	
	//Cube Function Implementation
	def cubeIt(x:Int)= x*x*x                  //> cubeIt: (x: Int)Int

	println(cubeIt(10))                       //> 1000
	
	
	//Passing function as a parameter in a function
	def transformIt(x:Int , f:Int => Int):Int={
		f(x)
	}                                         //> transformIt: (x: Int, f: Int => Int)Int
	
	transformIt(2,squareIt)                   //> res0: Int = 4
	
	//passing anonymous function in function arugments
	transformIt(3, x=> x*x*x)                 //> res1: Int = 27
}