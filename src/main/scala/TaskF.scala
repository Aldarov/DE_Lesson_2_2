import util.control.Breaks._

object TaskF {
  def run(): Unit = {
    val salaries = List(75, 80, 100, 120, 150, 200)
    val newSalary = 130

    var index = 0
    var finded = false
    breakable {
      for (i <- 0 to salaries.length - 1) {
        if (newSalary < salaries(i)) {
          index = i
          finded = true
          break
        }
      }
    }
    if (!finded) {
      index = salaries.length
    }

    val newSalaries = (salaries.slice(0, index) :+ newSalary) ::: salaries.slice(index, salaries.length)
    println(newSalaries)
  }
}
