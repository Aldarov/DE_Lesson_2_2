object TaskD {
  def run(): Unit = {
    var salaries = List(100, 150, 200, 80 ,120, 75)
    salaries = salaries :+ 400
    println(salaries)

    println("Max salary: " + salaries.max)
    println("Min salary: " + salaries.min)
  }
}
