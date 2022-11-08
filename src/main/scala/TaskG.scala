object TaskG {
  def run(): Unit = {
    val salaries = List(100, 150, 200, 80, 120, 75)

    for(s <- salaries) {
      if (s >= 120 && s <= 200) {
        println("Salary " + s + " is middle")
      }
    }
  }
}
