object TaskM {
  def run(): Unit = {
    var emp = Map[String, Int]()

    emp += ("Иванов И.А." -> 120)
    emp += ("Петров Н.А." -> 100)
    emp += ("Сидоров П.А." -> 270)
    emp += ("Павлов А.А." -> 120)
    emp += ("Семенов О.Н." -> 80)

    val vowels = List("а", "у", "о", "и", "э", "ы", "я", "ю", "е", "ё")
    var newEmp = Map[String, Int]()
    for((fullName, salary) <- emp) {
      var newName = fullName.split(" ")(0).reverse

      for(v <- vowels) {
        newName = newName.replace(v, "")
      }

      newEmp += (newName -> salary)
    }

    println(newEmp)
  }
}
