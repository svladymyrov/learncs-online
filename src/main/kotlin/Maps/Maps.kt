package maps

fun wordLength(str: String?): Map<String, Int> {
  val words = (str ?: "").split(" ")
  val wordsLengthMap = mutableMapOf<String, Int>()
  for (w in words) {
    wordsLengthMap += w to w.length
  }
  return wordsLengthMap
}

fun hasDuplicateValues(m: Map<String, String>): Boolean {
  val values = mutableSetOf<String>()
  for (value in m.values) {
    values += value
  }
  return values.size != m.keys.size
}

fun main() {
  println(wordLength(("Wow that is amazing")))
  println(wordLength((null)))
  println(hasDuplicateValues(mapOf("q" to "qw", "w" to "qw")))
}
