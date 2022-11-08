import scala.io.StdIn.{readInt}
import scala.collection.mutable.Map

object TaskI {
  def getNewSalaries(salaryByMarket: Map[String, Int]): Unit = {
    val avgJuniorSalaryByMarket = salaryByMarket.getOrElse("junior", 0)
    val avgMiddleSalaryByMarket = salaryByMarket.getOrElse("middle", 0)
    val avgSeniorSalaryByMarket = salaryByMarket.getOrElse("senior", 0)

    val salaries = List(100, 150, 200, 80, 120, 130, 75, 60, 75, 210, 230)
    println("Current salaries: " + salaries.sorted)

    var juniorSalaries = List[Int]()
    var middleSalaries = List[Int]()
    var seniorSalaries = List[Int]()
    for (s <- salaries) {
      if (s < 100) {
        juniorSalaries = juniorSalaries :+ s
      } else if (s >= 100 && s < 200) {
        middleSalaries = middleSalaries :+ s
      } else {
        seniorSalaries = seniorSalaries :+ s
      }
    }
    val avgJuniorSalary = (juniorSalaries.sum.toDouble / juniorSalaries.size)
    val avgMiddleSalary = (middleSalaries.sum.toDouble / middleSalaries.size)
    val avgSeniorSalary = (seniorSalaries.sum.toDouble / seniorSalaries.size)

    val coefJun = 2 - avgJuniorSalary / avgJuniorSalaryByMarket
    val coefMid = 2 - avgMiddleSalary / avgMiddleSalaryByMarket
    val coefSen = 2 - avgSeniorSalary / avgSeniorSalaryByMarket

    var newSalaries = List[Int]()

    for (s <- juniorSalaries) {
      newSalaries = newSalaries :+ (s * coefJun).toInt
    }
    for (s <- middleSalaries) {
      newSalaries = newSalaries :+ (s * coefMid).toInt
    }
    for (s <- seniorSalaries) {
      newSalaries = newSalaries :+ (s * coefSen).toInt
    }

    println("New salaries: " + newSalaries.sorted)
  }

  def getSalaryByMarket(): Map[String, Int] = {
    val res =  Map[String, Int]()
    print("Введите средний зарабок junior-сотрудников: ")
    res += ("junior" -> readInt())

    print("Введите средний зарабок middle-сотрудников: ")
    res += ("middle" -> readInt())

    print("Введите средний зарабок senior-сотрудников: ")
    res += ("senior" -> readInt())

//    res += ("junior" -> 100)
//    res += ("middle" -> 175)
//    res += ("senior" -> 250)
  }

  def run(): Unit = {
    val salaryByMarket = getSalaryByMarket()
    getNewSalaries(salaryByMarket)
  }
}
