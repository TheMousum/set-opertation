object remove_elements_from_set {
  def main(args: Array[String]): Unit = {
    var mySet: Set[Int] = Set(1, 2, 3, 4, 5)

    // Print the original set
    println("Original Set: " + mySet)

    // Remove an element from the set
    val elementToRemove = 3
    mySet = mySet - elementToRemove

    // Print the set after removing the element
    println("Set after removing " + elementToRemove + ": " + mySet)
  }
}

