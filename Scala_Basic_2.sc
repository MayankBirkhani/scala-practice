object Scala_Basic_2 {
	// *******************Scala Interpolations**************************
	
	//s interpolation
	var name: String = "Mayank"               //> name  : String = Mayank
	println(s"My name is $name")              //> My name is Mayank
	
	//f interpolation
	val pi : Double = 3.1415                  //> pi  : Double = 3.1415
	println(f"Value of pi is $pi%.2f")        //> Value of pi is 3.14
	
	//raw interpolation
	println(raw"Printing it \n as it is")     //> Printing it \n as it is
	
	// comparison operator in Scala
	 val x: String = "mayank"                 //> x  : String = mayank
	 val y: String = "mayank"                 //> y  : String = mayank
	 
	 val z: Boolean = x==y                    //> z  : Boolean = true
	
	
	// **********************Flow Control*********************************
	//If else
	val age : Int = 10                        //> age  : Int = 10
	if(age>18){
		println("Vote")
	}
	else{
		println("Underage")
	}                                         //> Underage
	
	// Match Cases:- It is like switch
	val num = 1                               //> num  : Int = 1
	
	num match{
		case 1 => println("One")
		case 2 => println("Two")
		case 3 => println("Three")
		case _ => println("Something else")
	}                                         //> One
	
	
	// for loop
	for(x <- 1 to 10){
		val squared = x*x
		println(squared)
	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  //| 25
                                                  //| 36
                                                  //| 49
                                                  //| 64
                                                  //| 81
                                                  //| 100
	
	
	// While Loop
	var i = 0                                 //> i  : Int = 0
	while(i <= 10){
		println(i)
		i = i+1
	}                                         //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
	
	// Do While Loop
	i=0
	do{
		println(i)
		i=i+1
	}while(i<=10)                             //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
	
//***************Block of Code*******************
// last statement in the block will be the value whic will be returned

	val result={
		val x =10
		x+20
		20
	}                                         //> result  : Int = 20
	println("Value returned from block is "+result)
                                                  //> Value returned from block is 20

}