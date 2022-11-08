import util.control.Breaks._

object TaskL {
  def run(): Unit = {
    var emp = Map[String, Int]()

    emp += ("Иванов И.А." -> 120)
    emp += ("Петров Н.А." -> 100)
    emp += ("Сидоров П.А." -> 270)
    emp += ("Павлов А.А." -> 120)
    emp += ("Семенов О.Н." -> 80)

    var maxSalary = 0
    var maxFullName = ""
    var minSalary = 0
    var minFullName = ""
    var isFirst = true
    for((fullName, salary) <- emp) {
      breakable {
        if (isFirst) {
          maxSalary = salary
          maxFullName = fullName
          minSalary = salary
          minFullName = fullName
          isFirst = false
          break
        }

        if (salary > maxSalary) {
          maxSalary = salary
          maxFullName = fullName
        }
        if (salary < minSalary) {
          minSalary = salary
          minFullName = fullName
        }
      }
    }

    println(f"Макс. зарплата: $maxFullName - $maxSalary")
    println(f"Мин. зарплата: $minFullName - $minSalary")
  }
}
