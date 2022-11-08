import scala.annotation.tailrec
import scala.io.StdIn.readInt

object TaskO {
  def resultExponentiation(degree: Int): Int = {
    if (degree == 1)
      return 2
    else
      return 2 * resultExponentiation(degree - 1)
  }

  @tailrec
  def resultExponentiationTail(degree: Int, acc: Int = 1): Int = {
    if (degree == 0) return acc
    return resultExponentiationTail(degree - 1, acc * 2)
  }

  def resultExponentiationTailFor(): Int = {
    var degree = 3
    var acc = 1
    while (true) {
      if (degree == 0) return acc
      acc = acc * 2
      degree = degree - 1
    }

    return acc
  }

  def run(): Unit = {
    print("Введите натуральное число степени, в которую нужно возвести цифру 2: ")
    val degree = readInt()

    println(resultExponentiation(degree))
    println(resultExponentiationTail(degree))
  }
}
