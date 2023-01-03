object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	val student = ("Student1",90,"Banglore","Postgraduate")
                                                  //> student  : (String, Int, String, String) = (Student1,90,Banglore,Postgraduat
                                                  //| e)
	
	student->2                                //> res0: ((String, Int, String, String), Int) = ((Student1,90,Banglore,Postgrad
                                                  //| uate),2)
	
	val a = 10                                //> a  : Int = 10
	val b = if(a==5) println("hello") else(1,"hi")
                                                  //> b  : Any = (1,hi)
          
          
  val x = List.range(1,10)                        //> x  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

	
	lazy val output = {println("Hello");1}    //> output: => Int = <lazy>
	val learn = println("Learning Scala")     //> Learning Scala
                                                  //| learn  : Unit = ()
	val finalop = println(output)             //> Hello
                                                  //| 1
                                                  //| finalop  : Unit = ()
}