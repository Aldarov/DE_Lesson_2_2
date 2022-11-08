import scala.io.StdIn.{readLine, readInt}
import scala.collection.mutable.Map

object TaskC {
  def run() {
    print("Введите количество сотрудников: ")
    val count = readInt()
    println()

    val salaries = scala.collection.mutable.Map[String, Int]()
    for(i <- 1 to count) {
      val fullName = readLine("Введите ФИО сотрудника: ")
      print("Введите размер оклада " + fullName + ": ")
      val salary = readInt()

      salaries += (fullName -> salary)
    }

    val avg = salaries.values.sum / count.toFloat;

    val res = scala.collection.mutable.Map[String, Float]()
    for (s <- salaries) {
      res += (s._1 -> (s._2 - avg) * 100 / avg )
    }

    for ((k, v) <- res) {
      println(k + " отклонение оклада: " + v.round + "%")
    }
  }
}
