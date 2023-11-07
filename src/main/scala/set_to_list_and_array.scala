object SetToListAndArray {
  def main(args: Array[String]): Unit = {
    // Sample set of integers
    val numbersSet: Set[Int] = Set(1, 2, 3, 4, 5)

    // Transforming set to list
    val numbersList: List[Int] = numbersSet.toList

    // Transforming set to array
    val numbersArray: Array[Int] = numbersSet.toArray

    // Printing the original set, list, and array
    println("Original Set: " + numbersSet)
    println("Transformed List: " + numbersList)
    println("Transformed Array: " + numbersArray.mkString("[", ", ", "]"))
  }
}
