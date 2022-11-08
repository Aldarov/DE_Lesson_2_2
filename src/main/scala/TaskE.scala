object TaskE {
  def run(): Unit = {
    var salaries = List(100, 150, 200, 80, 120, 75)
    salaries = salaries :+ 350 :+ 90
    println(salaries.sorted)
  }
}
