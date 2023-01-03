object Scala_Session_2 {

var a = 1 to 10                                   //> a  : scala.collection.immutable.Range.Inclusive = Range 1 to 10

//***************************** Higher order function *******************************
def doubler(i: Int): Int={
	i * 2
}                                                 //> doubler: (i: Int)Int

//here Map will be Higher order function
a.map(doubler)                                    //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12
                                                  //| , 14, 16, 18, 20)


//***************************** Higher order function *******************************
a.map(x => x * 3 )                                //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(3, 6, 9, 12, 15, 1
                                                  //| 8, 21, 24, 27, 30)

//***************************** Factorial Program using loop *******************************
def factorial(input: Int):Int={
	var result: Int = 1
	for(i <- 1 to input){
	 result = result * i
	}
	result
}                                                 //> factorial: (input: Int)Int
factorial(5)                                      //> res2: Int = 120

//***************************** Factorial Program using Recursion *******************************

def cal_factorial(input : Int):Int ={
	if(input==1) 1
	else  input * cal_factorial(input - 1)

}                                                 //> cal_factorial: (input: Int)Int
cal_factorial(5)                                  //> res3: Int = 120







}