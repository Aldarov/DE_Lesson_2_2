object TaskH {
  def run(): Unit = {
    val salaries= List(100, 150, 200, 80, 120, 75)
    println(salaries)

    var newSalaries: List[Double] = List()
    for (s <- salaries) {
      val value = BigDecimal(s * 1.07).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      newSalaries = newSalaries :+ value
    }

    println(newSalaries)
  }
}
