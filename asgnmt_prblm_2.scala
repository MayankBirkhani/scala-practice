// Print an integer representing the number of elements in the list which are strictly less than num.
import scala.io.StdIn._

object asgnmt_prblm_2 {

  def main(args: Array[String]) {

    //Taking input as number of elements and elements which has to be compared
    val numElements: String = readLine()

    //Reading list of elements
    val inputElements: String = readLine()

    val numElementsArr = numElements.split(" ").map(x => x.toInt)

    val inputArr = inputElements.split(" ").map(x => x.toInt)

    val numK = numElementsArr(1)

    var count = 0
    for (i <- inputArr) {
      if (i < numK) {
        count += 1
      }
    }
    println(count)
  }
}