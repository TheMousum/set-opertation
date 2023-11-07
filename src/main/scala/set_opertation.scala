object set_opertation {
  def main(args: Array[String]): Unit = {
  val mySet: Set[Int] = Set(1, 2, 3, 4, 5)

  // Print the original set
  println("Original Set: " + mySet)

  // Adding an element to the set
  val updatedSet = mySet + 6
  println("Set after adding 6: " + updatedSet)

  // Removing an element from the set
  val removedSet = updatedSet - 3
  println("Set after removing 3: " + removedSet)

  // Checking if an element exists in the set
  val containsElement = removedSet.contains(2)
  println("Set contains 2: " + containsElement)

  // Iterate through the set elements
  println("Set elements:")
  removedSet.foreach(println)

  // Set operations - Union, Intersection, and Difference
  val set1: Set[Int] = Set(1, 2, 3, 4, 5)
  val set2: Set[Int] = Set(3, 4, 5, 6, 7)

  val unionSet = set1.union(set2)
  val intersectionSet = set1.intersect(set2)
  val differenceSet = set1.diff(set2)

  println("Union of set1 and set2: " + unionSet)
  println("Intersection of set1 and set2: " + intersectionSet)
  println("Difference of set1 and set2: " + differenceSet)
}
}

