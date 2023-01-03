object Scala_Session_4 {

//  *********************** Partial Applied Function ************************************

def divideFunc(x: Double , y: Double ) = {
	x/y
}                                                 //> divideFunc: (x: Double, y: Double)Double


divideFunc(10,2)                                  //> res0: Double = 5.0

def sumFunc(x:Int, y:Int) ={
	x+y
}                                                 //> sumFunc: (x: Int, y: Int)Int

sumFunc(4,8)                                      //> res1: Int = 12

//Partial Function
val increment = sumFunc(1,_:Int)                  //> increment  : Int => Int = Scala_Session_4$$$Lambda$8/940060004@dfd3711


increment(12)                                     //> res2: Int = 13


def genericSum(x:Int, y:Int, f:Int => Int) ={
	f(x) + f(y)
}                                                 //> genericSum: (x: Int, y: Int, f: Int => Int)Int

genericSum(2,3,x=>x)                              //> res3: Int = 5

genericSum(2,3,x=>x*x)                            //> res4: Int = 13

genericSum(2,3,x=>x*x*x)                          //> res5: Int = 35


val sumOfCubes = genericSum(_:Int,_:Int,x=>x*x*x) //> sumOfCubes  : (Int, Int) => Int = Scala_Session_4$$$Lambda$12/2017354584@175
                                                  //| 50481

sumOfCubes(12,13)                                 //> res6: Int = 3925





//  *********************** Function Currying ************************************


def genericCurrySum(f:Int => Int)(x:Int,y:Int) ={
	f(x) + f(y)
}                                                 //> genericCurrySum: (f: Int => Int)(x: Int, y: Int)Int
genericCurrySum(x=>x*x)(5,3)                      //> res7: Int = 34

val sumOfSquares =genericCurrySum(x=>x*x)_        //> sumOfSquares  : (Int, Int) => Int = Scala_Session_4$$$Lambda$16/610984013@62
                                                  //| 043840
sumOfSquares(3,4)                                 //> res8: Int = 25




}