object Scala_Basic_4 {
  
  //***********************Scala Collections*************************************
  
  //*********Array*********
  val a = Array(1,2,3,4,5)                        //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
  
  println(a.mkString(","))                        //> 1,2,3,4,5
  
  for(i <- a){
  	println(i)                                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
	}
  
  //Array is mutable
  a(2)=7
  println(a.mkString(","))                        //> 1,2,7,4,5
  


	//*********List*********
	val b = List(1,2,3,4,5)                   //> b  : List[Int] = List(1, 2, 3, 4, 5)
	println(b.head)                           //> 1
	println(b.tail)                           //> List(2, 3, 4, 5)
	println(b.reverse)                        //> List(5, 4, 3, 2, 1)


	//*********Tuple*********
	val x = ("Mayank",10000,25)               //> x  : (String, Int, Int) = (Mayank,10000,25)
	println(x.getClass)                       //> class scala.Tuple3
	println("First element of tuple is "+x._1)//> First element of tuple is Mayank
	println("Second element of tuple is "+x._2)
                                                  //> Second element of tuple is 10000

	//*********Range*********
  //val rng = 1 until 10
	val rng = 1 to 10                         //> rng  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
	
	for(i <- rng){
		println(i)                        //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
	}
	
	//*********Set*********
	val set_eg = Set(1,1,1,1,2,2,3,3,4,5)     //> set_eg  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
	set_eg.min                                //> res0: Int = 1
	set_eg.max                                //> res1: Int = 5
	set_eg.sum                                //> res2: Int = 15


	//*********Map*********
	val map_eg = Map(1->"Mayank", 2->"Sushant") // If you try to add dulicate keys first one will be discarded
                                                  //> map_eg  : scala.collection.immutable.Map[Int,String] = Map(1 -> Mayank, 2 ->
                                                  //|  Sushant)
	map_eg.get(2)                             //> res3: Option[String] = Some(Sushant)









}