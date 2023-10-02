/**
 * FUNCTIONS
 * */
fun isEven(num: Int): Boolean {
  return num % 2 == 0
}

fun isOdd(num: Int): Boolean {
  return num % 2 != 0
}

fun makeEnds(values: IntArray): IntArray {
  return intArrayOf(values[0], values[values.lastIndex])
}

fun makeLast(values: IntArray): IntArray {
  return intArrayOf(*IntArray(values.size * 2 - 1), values[values.lastIndex - 1])
}

// [1,2,4,5,6,7]
// arr[size / 2 - 1], arr[size / 2]
fun makeMiddle(values: IntArray): IntArray {
  return intArrayOf(values[values.size / 2 - 1], values[values.size / 2])
}

// [1,2,3,4,5,6,7]
// (size - 3) / 2
// (7 - 3) / 2 = 2
// (5 - 3) / 2 = 1
// (3 - 3) / 2 = 0
fun midThree(values: IntArray): IntArray {
  val marginSize = (values.size - 3) / 2
  // uses less memory: intArrayOf(values[marginSize], values[margin + 1], values[marginSize + 2])
  return values.slice(marginSize..marginSize+2).toIntArray()
}

/**
 * MAIN
 * */
fun main(): Unit {
  println(midThree(intArrayOf(1,2,3,4,5)).joinToString(" "))
}