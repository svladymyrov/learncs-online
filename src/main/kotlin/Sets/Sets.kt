package sets

import java.lang.IllegalArgumentException

fun calculateSuspects(a: Set<String>, b: Set<String>, c: Set<String>): Set<String> {
  return a.intersect(b).plus(a.intersect(c)).plus(b.intersect(c))
}

fun toSet(strings: List<String>?): Set<String> {
  if (strings == null) {
    throw IllegalArgumentException("Argument should not be null")
  }
  val strSet = mutableSetOf<String>()
  for (str in strings) {
    strSet += str
  }
  return strSet
}

fun main () {
  println(sets.calculateSuspects(setOf("q", "w", "e", "r", "t", "y"), setOf("z", "w", "v", "t"), setOf("z", "m")))
  println(toSet(listOf("test", "me", "test")))
}
