object SetMappingAndFiltering {
  def main(args: Array[String]): Unit = {
    // Sample set of integers
    val numbers: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Mapping: Multiply each element by 2 using map
    val mappedSet: Set[Int] = numbers.map(x => x * 2)
    println("Mapped Set (multiply each element by 2): " + mappedSet)

    // Filtering: Filter out even numbers using filter
    val filteredSet: Set[Int] = numbers.filter(x => x % 2 != 0)
    println("Filtered Set (odd numbers only): " + filteredSet)
  }
}
