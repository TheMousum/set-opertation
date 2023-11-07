object SetOperations {
  def main(args: Array[String]): Unit = {
    // Creating sets
    val set1: Set[Int] = Set(1, 2, 3, 4, 5)
    val set2: Set[Int] = Set(3, 4, 5, 6, 7)

    // Union of sets
    val unionSet = set1.union(set2)
    println("Union of set1 and set2: " + unionSet)

    // Intersection of sets
    val intersectionSet = set1.intersect(set2)
    println("Intersection of set1 and set2: " + intersectionSet)

    // Checking if sets are disjoint
    val isDisjoint = set1.intersect(set2).isEmpty
    if (isDisjoint) {
      println("Set1 and set2 are disjoint sets.")
    } else {
      println("Set1 and set2 have common elements.")
    }
  }
}
