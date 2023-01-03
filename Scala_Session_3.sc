object Scala_Session_3 {

//  *********************** Closure Example ************************************

def areaOfCircle={
	val pi = 3.14
	//Anonymous Function
	(r:Int)=> pi*r*r
}                                                 //> areaOfCircle: => Int => Double

areaOfCircle(10)                                  //> res0: Double = 314.0

val pi = 6.14                                     //> pi  : Double = 6.14


areaOfCircle(10)                                  //> res1: Double = 314.0



// Conclusion:- A value or a particular state is bound to a function







}