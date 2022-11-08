import scala.io.StdIn.{readInt}
import scala.collection.mutable.Map

object TaskN {
  def input(): Map[String, Int] = {
    val res =  Map[String, Int]()
    print("Введите годовой доход до вычета налога: ")
    res += ("revenue" -> readInt())

    print("Введите размер премии в процентах от годового дохода: ")
    res += ("bonus" -> readInt())

    print("Введите размер компенсации питания: ")
    res += ("foodCost" -> readInt())
  }

  def calcSalary(inputValues: Map[String, Int]): Double = {
    val revenue = inputValues.getOrElse("revenue", 0)
    val bonus = inputValues.getOrElse("bonus", 0)
    val foodCost = inputValues.getOrElse("foodCost", 0)

    var salary = (revenue + revenue * bonus / 100 + foodCost) * 0.87 / 12
    salary = BigDecimal(salary).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    return salary
  }

  def showSalary(salary: Double): Unit = {
    println("Eжемесячный оклад сотрудника после вычета налогов: " + salary)
  }

  def run() {
    val inputValues = input()
    val salary = calcSalary(inputValues)
    showSalary(salary)
  }
}