import java.lang.IllegalArgumentException

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

fun calculateGrossProfit(revenue: IntArray, expenses: IntArray): Int {
  var profit = 0
  for (i in revenue.indices) {
    profit += revenue[i] - expenses[i]
  }
  return profit
}

fun commonEnd(first: IntArray, last: IntArray): Boolean {
  return first[0] == last[0] || first[first.lastIndex] == last[last.lastIndex]
}

fun nearTen(num: Int): Boolean {
  return num % 10 in 0..2 || num % 10 in 8..9
}

fun multiply(a: Double, b: Double): Double {
  return a * b
}
fun multiply(a: Double, b: Double, c: Double): Double {
  return a * b * c
}

fun reversePrint(arr: CharArray): Int {
  for (i in arr.size - 1 downTo 0) {
    println(arr[i])
  }
  return arr.size
}

fun specialEleven(n: Int): Boolean {
  return n % 11 in 0..1
}

fun sumDouble(a: Int, b: Int): Int {
  val sum = a + b
  return if (a != b) {
    sum
  } else {
    sum * 2
  }
}

// [5.0, 4.0, 4.5]
fun catchupGrading(grades: DoubleArray): Int {
  var count = 0
  for (i in grades.indices) {
    if (i == grades.lastIndex) continue
    val grade = grades[i]
    val nextGrade = grades[i + 1]
    if (grade < nextGrade) {
      grades[i] = (grade + nextGrade) / 2
      count += 1
    }
  }
  return count
}


/**
 * STRINGS
 * */
fun backAround(input: String): String {
  return "${input[input.lastIndex]}$input${input[input.lastIndex]}"
}

fun emailToNetId(email: String): String {
  val eList = email.split("@")
  if (eList[1] != "illinois.edu") {
    throw IllegalArgumentException("Unsupported email domain")
  }
  return eList[0]
}

fun endsLy(s: String): Boolean {
  return s.length > 1 && s.endsWith("ly")
}

/**
 * MAIN
 * */
fun main(): Unit {
  println(midThree(intArrayOf(1,2,3,4,5)).joinToString(" "))
  println(specialEleven(34))
  println(catchupGrading(doubleArrayOf(5.0, 3.0, 4.5)))
  println(backAround("qwerty"))
  println(emailToNetId("student@illinois.edu"))
}