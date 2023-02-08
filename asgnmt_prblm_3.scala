// Given a sentence of words we need to reverse it with 3 variations

import scala.io.StdIn._

object asgnmt_prblm_3 {
  def main(args: Array[String]){
    
    //Taking input
    val input : String = readLine()          // hello how are you
    
    // reversing the sentence literally
    val output1 = input.reverse
    println(output1)
    
    // reversing each word in the sentence
    val output2 = input.split(" ").map(x=> x.reverse)
    println(output2.mkString(" "))
    
    // reversing the order of words in sentence
    val output3 = input.split(" ").reverse
    println(output3.mkString(" "))
    
  }
}