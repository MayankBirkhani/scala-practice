//print an integer representing the number of customers that will be given discounts

import scala.math._
import scala.io.StdIn._


object asgnmt_prblm_1 {
  
  def main(args: Array[String]) {

    // Taking number of customers as input
    val numCustomers: Int = readInt()

    // Taking second line as input
    val billAmount: String = readLine()

    //Splitting and converting in into Int type
    val billAmt = billAmount.split(" ").map(x => x.toInt)

    var count = 0
    for (i <- billAmt) {
      val sqrt = Math.sqrt(i)

      if (sqrt.ceil - sqrt == 0) {
        count = count + 1
      }
    }
    println(count)
  }       
}