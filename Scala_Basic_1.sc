object Scala_Basic_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
println("Hello World")                            //> Hello World
  
  1+3                                             //> res0: Int(4) = 4
  
  //**********************Concept of val and Var**********************************
  val a: Int = 10                                 //> a  : Int = 10
  val b: String = "Hello"                         //> b  : String = Hello
  
  //Concept of var
  var c: String = "Original"                      //> c  : String = Original
  c= "c is reassigned!"
  println(c)                                      //> c is reassigned!
  
  //**********************Infer example********************************************
  val numberOne = 5                               //> numberOne  : Int = 5
  
  val d : Boolean = true                          //> d  : Boolean = true

	val e: Char = 'a'                         //> e  : Char = a

	val pi : Double = 3.1415 //can hold better precision than float
                                                  //> pi  : Double = 3.1415

	val singlePointPrecision = 3.1415f        //> singlePointPrecision  : Float = 3.1415

	val f : Long = 1234567890L //can hold longer value than Int
                                                  //> f  : Long = 1234567890

	val smallNumber : Byte = 127  //can hold -128 to 127
                                                  //> smallNumber  : Byte = 127

	//concatenating results
	println("concatenated results: "+ f + smallNumber +pi)
                                                  //> concatenated results: 12345678901273.1415


}