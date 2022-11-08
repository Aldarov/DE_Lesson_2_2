import scala.io.StdIn.{readInt}

object TaskB {
  def run() {
    print("Введите годовой доход до вычета налога: ")
    val revenue = readInt()

    print("Введите размер премии в процентах от годового дохода: ")
    val bonus = readInt()

    print("Введите размер компенсации питания: ")
    val foodCost = readInt()

    var salary = (revenue + revenue * bonus / 100 + foodCost) * 0.87 / 12
    salary = BigDecimal(salary).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

    println("Eжемесячный оклад сотрудника после вычета налогов: " + salary)
  }
}
