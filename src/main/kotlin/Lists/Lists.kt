package lists

//  "Xyz is the very best cat"
fun smallWordFilter(words: String): List<String> =
  words.split(' ').filter { it.length <= 3 }

fun lastInList(l: List<*>): Any? = l[l.lastIndex]

fun main() {
  println(smallWordFilter("Xyz is the very best cat"))
  println(lastInList(listOf("qw", null)))
}
